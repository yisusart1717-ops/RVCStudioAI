plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.rvcstudioai.app"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.rvcstudioai.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
