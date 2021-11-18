package dependencies.test

import Versions

object CucumberDependencies {
    const val CucumberJavaTest = "io.cucumber:cucumber-java:${Versions.cucumber}"
    const val CucumberJUnitTest = "io.cucumber:cucumber-junit-platform-engine:${Versions.cucumber}"
}

val testImplementation: Configuration by configurations
dependencies {
    testImplementation(CucumberDependencies.CucumberJavaTest)
    testImplementation(CucumberDependencies.CucumberJUnitTest)
}
