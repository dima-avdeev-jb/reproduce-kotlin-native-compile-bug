include(":shared")
include(":jvm")

pluginManagement {
    plugins {
        val kotlinVersion = "1.8.20"
        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
