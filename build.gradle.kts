plugins {
    kotlin("jvm") version "1.4.32"
    application
}

group = "org.mrlem.sample.kotlinpoet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup:kotlinpoet:1.8.0")
}

application {
    mainClass.set("org.mrlem.sample.kotlinpoet.MainKt")
}
