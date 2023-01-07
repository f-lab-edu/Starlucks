plugins {
    id("java")
    id("checkstyle")
}

group = "org.example"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

allprojects {
    repositories {
        mavenCentral()
    }
}

dependencies {
    testImplementation("org.mockito:mockito-junit-jupiter:4.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

checkstyle {
    maxWarnings = 0 //규칙이 어긋나는 코드가 하나라도 있으면 빌드 fail
    configFile = file("${rootDir}/java-google-check.xml")
}