pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "cascade"

for (name in listOf("cascade-api", "cascade-server", "paper-api-generator")) {
    val projName = name.lowercase()
    include(projName)
    findProject(":$projName")?.projectDir = file(name)
}
