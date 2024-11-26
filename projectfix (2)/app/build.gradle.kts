plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.projectfix"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projectfix"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

buildscript {
    repositories {
        google()
        mavenCentral() // Gantikan jcenter() dengan mavenCentral()
        maven("https://jitpack.io") // Tambahkan repositori JitPack untuk dependensi eksternal
    }
    dependencies {
        classpath(libs.gradle) // Gunakan versi terbaru Gradle Plugin
    }
}

allprojects {
    repositories {
        google()
        mavenCentral() // Gantikan jcenter() dengan mavenCentral()
        maven("https://jitpack.io") // Tambahkan repositori JitPack
    }
}

dependencies {
    implementation(libs.mpandroidchart)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}