plugins {
    java
    `java-library`
}

repositories {
    mavenLocal()
    jcenter()
    mavenCentral()
}

dependencies {

    implementation("com.graphql-java:graphql-java:18.1")
    implementation("io.reactivex.rxjava3:rxjava:3.1.4")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.2.2")
    implementation("com.google.code.gson:gson:2.9.0")

    implementation("org.slf4j:slf4j-simple:2.0.0-alpha7")

    // Jetty 11 version
    implementation("org.eclipse.jetty:jetty-server:11.0.9")
    implementation("org.eclipse.jetty:jetty-servlet:11.0.9")
    implementation("org.eclipse.jetty.websocket:websocket-jetty-server:11.0.9")
    implementation("org.eclipse.jetty.websocket:websocket-core-common:11.0.9")
}

configurations {
    "implementation" {
        resolutionStrategy.failOnVersionConflict()
    }
}

configure<SourceSetContainer> {
    named("main") {
        java.srcDir("src/main/java")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    named<Test>("test") {
        testLogging.showExceptions = true
    }
}