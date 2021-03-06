plugins {
    id("com.google.devtools.ksp")
    kotlin("jvm")
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":test-processor"))
    ksp(project(":test-processor"))
}

ksp {
    arg("option1", "value1")
    arg("option2", "value2")
}

kotlin {
    sourceSets {
        main {
            kotlin.srcDir("$buildDir/generated/ksp/main/java")
            kotlin.srcDir("$buildDir/generated/ksp/main/kotlin")
        }
    }
}