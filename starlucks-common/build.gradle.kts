plugins {
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
}

dependencies {
}

tasks {
    jar { enabled = true }
    bootJar { enabled = false }
}