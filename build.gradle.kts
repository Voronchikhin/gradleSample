plugins {
    java
}

group = "test-kts"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//sample of vulnerable dependency
// "com.google.guava:guava:$a"
val a = "18.0-rc1"

dependencies {
    implementation("com.google.guava:guava:21.0")

    compile("junit", "junit", "4.0")
    testCompile("junit", "junit", "4.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
//http://example.com
