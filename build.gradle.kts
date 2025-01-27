// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.AdaDevDroid" // GitHub Username
            artifactId = "swipe-reveal-layout" // ชื่อ Library
            version = "1.0.0" // เวอร์ชันของ Library

            artifact("libs/swipe-reveal-layout-1.4.1.aar") { // ระบุไฟล์ .aar ที่ต้องการเผยแพร่
                extension = "aar" // ระบุชนิดไฟล์
            }
        }
        repositories {
            mavenLocal()
        }
    }
}