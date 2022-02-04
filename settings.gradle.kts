rootProject.name = "test-impl"

includeBuild("test-common"){
    dependencySubstitution {
        substitute(module("io.shaded.test-common:test-common")).using(project(":"))
    }
}