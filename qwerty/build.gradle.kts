plugins {
    java
}
group = "test-kts"

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    implementation("io.undertow:undertow-core:2.0.1.Final")
    implementation(group= "com.fasterxml.jackson.core", name="jackson-databind", version="2.9.2")
    implementation(group= "org.kohsuke", name= "github-api", version = "1.95")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}