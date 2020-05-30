package com.marshalldbrain.ion.collections

fun <T> queueOf(): Queue<T>{
    return DequeImpl(mutableListOf())
}

//fun <T> queueOf(vararg elements: T): Queue<T>{
//    return DequeImpl(ArrayDeque(elements.toList()))
//}
//
//fun <T> queueOf(size: Int, init: (index: Int) -> T): Queue<T> {
//    val queue = DequeImpl(ArrayDeque<T>(size))
//    repeat(size) { index -> queue.add(init(index)) }
//    return queue
//}