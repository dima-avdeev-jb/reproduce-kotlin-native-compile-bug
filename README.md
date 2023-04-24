# Compilation bug in Kotlin Native and Kotlin JS
https://github.com/JetBrains/compose-multiplatform/issues/2255

### To reproduce on iOS:
`./gradlew shared:linkPodDebugFrameworkIosSimulatorArm64`
(On JS we have the same error)

### Works fine on JVM
`./gradlew jvm:run`
