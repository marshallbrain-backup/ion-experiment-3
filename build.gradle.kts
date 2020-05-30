plugins {
    kotlin("multiplatform") version "1.3.72"
}

group = "com.marshalldbrain"
version = "0.1"

repositories {
    mavenCentral()
}

kotlin {

    jvm()

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        jvm().compilations["main"].defaultSourceSet {
            dependencies {
                implementation(kotlin("stdlib-jdk7"))
                implementation("org.slf4j:slf4j-api:1.7.30")
                implementation("org.slf4j:slf4j-log4j12:1.7.30")
            }
        }

        jvm().compilations["test"].defaultSourceSet {

            dependencies {
                implementation("io.kotest:kotest-runner-junit5-jvm:4.0.5")
                implementation("io.kotest:kotest-assertions-core-jvm:4.0.5")
                implementation("io.kotest:kotest-property-jvm:4.0.5")
                implementation("org.assertj:assertj-core:3.16.1")
                implementation("io.mockk:mockk:1.10.0")
            }

            tasks {
                // Use the built-in JUnit support of Gradle.
                "jvmTest"(Test::class) {
                    useJUnitPlatform()
                }
            }

        }

    }

}

apply("dependencies.gradle.kts")