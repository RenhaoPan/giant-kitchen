plugins {
    id("java")
}

group = "com.giant.kitchen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

configurations.all {
    // 全局排除冲突的日志绑定
    exclude(group = "ch.qos.logback", module = "logback-classic")
    exclude(group = "org.apache.logging.log4j", module = "log4j-to-slf4j")
    exclude(group = "org.slf4j", module = "slf4j-log4j12")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.4.2") {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-logging")
    }
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.4.2")
    implementation("org.springframework.boot:spring-boot-starter-log4j2:2.4.2")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.4") {
        exclude(group = "org.slf4j", module = "slf4j-log4j12")
    }
    implementation("org.springframework.boot:spring-boot-starter:2.4.2")
    implementation("org.projectlombok:lombok:1.18.20")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.4")
    implementation("mysql:mysql-connector-java:8.0.28")
    implementation("com.alibaba:druid-spring-boot-starter:1.1.21") {
        exclude(group = "com.alibaba", module = "druid-log4j")
    }
    implementation("com.baomidou:mybatis-plus-boot-starter:3.4.0") {
        exclude(group = "org.slf4j")
    }


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}