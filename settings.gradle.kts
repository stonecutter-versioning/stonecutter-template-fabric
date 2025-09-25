pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
        maven("https://maven.kikugie.dev/snapshots") { name = "KikuGie Snapshots" }
    }
}

plugins {
    id("dev.kikugie.stonecutter") version "0.8-dev.2"
}

stonecutter {
    create(rootProject) {
        versions("1.21.8")
        vcsVersion = "1.21.8"
    }
}

rootProject.name = "Template"