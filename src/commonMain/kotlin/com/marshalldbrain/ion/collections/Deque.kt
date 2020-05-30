package com.marshalldbrain.ion.collections

interface Deque<E> : Queue<E> {

}

interface Queue<E> : Collection<E> {

    fun push(element: E): Boolean
    fun pushAll(element: Collection<E>): Boolean
    fun pop(): E
    fun peek(): E

}

//TODO Change to ArrayDeque after it is not experimental
internal class DequeImpl<E>(private val deque: MutableList<E>): MutableList<E> by deque, Deque<E> {

    override fun push(element: E): Boolean {
        return add(element)
    }

    override fun pushAll(element: Collection<E>): Boolean {
        return addAll(element)
    }

    override fun pop(): E {
        return removeAt(0)
    }

    override fun peek(): E {
        return get(0)
    }

}