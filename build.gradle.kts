import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.7.10"
}

tasks.withType<KotlinCompile>() {
    kotlinOptions {
        jvmTarget = "18"
    }
}

group = "realworld"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
kotlin.sourceSets["test"].kotlin.srcDirs("test")

sourceSets["main"].resources.srcDirs("resources")
sourceSets["test"].resources.srcDirs("testresources")

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.0.3")
    implementation("io.ktor:ktor-server-netty:2.0.3")
    implementation("io.ktor:ktor-server-auth:2.0.3")
    implementation("io.ktor:ktor-server-auth-jwt:2.0.3")
    implementation("io.ktor:ktor-server-content-negotiation:2.0.3")
    implementation("io.ktor:ktor-serialization-jackson:2.0.3")
    implementation("io.ktor:ktor-server-default-headers:2.0.3")
    implementation("io.ktor:ktor-server-cors:2.0.3")
    implementation("io.ktor:ktor-server-call-logging:2.0.3")
    implementation("io.ktor:ktor-server-status-pages:2.0.3")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("com.h2database:h2:2.1.214")
    implementation("org.jetbrains.exposed:exposed-core:0.38.2")
    implementation("org.jetbrains.exposed:exposed-dao:0.38.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.38.2")
    implementation("org.jetbrains.exposed:exposed-java-time:0.38.2")
    implementation("com.zaxxer:HikariCP:5.0.1")
    implementation("io.insert-koin:koin-ktor:3.2.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.10")
    testImplementation("io.ktor:ktor-server-test-host:2.0.3")
    testImplementation("io.ktor:ktor-client-content-negotiation:2.0.3")
}
