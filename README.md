# Compilation bug in Kotlin Native and Kotlin JS


### To reproduce on iOS:
`./gradlew shared:linkPodDebugFrameworkIosSimulatorArm64`
(On JS we have the same error)

### Works fine on JVM
`./gradlew jvm:run`
