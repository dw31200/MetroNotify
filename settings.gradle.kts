pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MetroNotify"
include(":app")
include(":core:data")
include(":core:database")
include(":core:network")
include(":core:domain")
include(":feature:search")
include(":feature:bookmarks")
include(":feature:arrivals")
include(":feature:setting")
