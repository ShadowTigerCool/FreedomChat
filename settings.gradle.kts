import org.gradle.configurationcache.extensions.capitalized

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "FreedomChat"

sequenceOf(
    "paper",
).forEach {
    include("${rootProject.name}-${it.capitalized()}")
    project(":${rootProject.name}-${it.capitalized()}").projectDir = file(it)
}
