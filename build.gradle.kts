plugins {
//    id("java")
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.4.21"
    kotlin("plugin.spring") version "1.4.21"
    kotlin("plugin.jpa") version "1.4.21"
    kotlin("kapt") version "1.4.21"
}

val graphQLSpringBootVersion: String by rootProject
val graphQLJavaToolVersion: String by rootProject
val queryDSLVersion: String by rootProject
val mapstructVersion: String by rootProject
val vkSdkVersion: String by rootProject
val hibernateTypesVersion: String by rootProject

group = "ru.denisqq"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    jcenter()
    mavenLocal()
    mavenCentral()
}

dependencies {
    //Kotlin libs
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    //Spring libs
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework.security:spring-security-data")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-security")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

//    //Graphql
    implementation ("com.graphql-java:graphql-java-tools:$graphQLJavaToolVersion")
    implementation ("com.graphql-java:graphql-spring-boot-starter:$graphQLSpringBootVersion")
    implementation("com.graphql-java:graphiql-spring-boot-starter:$graphQLSpringBootVersion")
    implementation("com.graphql-java:voyager-spring-boot-starter:$graphQLSpringBootVersion")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    //DB
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.liquibase:liquibase-core:3.10.2")
    implementation("com.vladmihalcea:hibernate-types-52:$hibernateTypesVersion")

    implementation("io.github.microutils:kotlin-logging-jvm:2.0.2")

//    implementation("com.vk.api:sdk:$vkSdkVersion") - подключить логгер

    //Mapstruct
    implementation("org.mapstruct:mapstruct:${mapstructVersion}")
    kapt("org.mapstruct:mapstruct-processor:${mapstructVersion}")
    testAnnotationProcessor("org.mapstruct:mapstruct-processor:${mapstructVersion}")

    kapt("com.querydsl:querydsl-apt:$queryDSLVersion:jpa")
    implementation("com.querydsl:querydsl-jpa:$queryDSLVersion")

    //Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    testImplementation("org.springframework.security:spring-security-test")
}


kapt {
    correctErrorTypes = true
    arguments {
        arg("mapstruct.defaultComponentModel", "spring")
        arg("mapstruct.unmappedTargetPolicy", "IGNORE")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
tasks {
    processResources {
        dependsOn("copyGraphqlScheme")
    }

    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict", "-Xjvm-default=enable")
            jvmTarget = "11"
        }
    }

    register("copyGraphqlScheme") {
        copy {
            from("./antferm-graphql-schema") {
                include("*.graphqls")
            }
            into("$buildDir/resources/main")
        }
    }
}
