plugins {
    id("functional-design.kotlin-common-conventions")
}

dependencies {
    implementation(project(":lib:memoize"))
    testImplementation(project(":lib:assertions"))
}
