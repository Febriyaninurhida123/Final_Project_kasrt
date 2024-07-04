pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Hindari jcenter jika memungkinkan karena deprecated
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

rootProject.name = "rtku"
include(":app")
