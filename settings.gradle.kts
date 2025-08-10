pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
        maven("https://maven.kikugie.dev/snapshots") { name = "KikuGie Snapshots" }
    }
}

plugins {
    id("dev.kikugie.stonecutter") version "0.7.7"
}

stonecutter {
    create(rootProject) {
        versions("1.20.1", "1.21.1", "1.21.8")
        vcsVersion = "1.21.8"
    }
}

rootProject.name = "Template"