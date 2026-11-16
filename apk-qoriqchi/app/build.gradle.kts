plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "uz.firdavs.apkqoriqchi"
    compileSdk = 35

    defaultConfig {
        applicationId = "uz.firdavs.apkqoriqchi"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.1-demo"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
