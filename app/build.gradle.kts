// app/build.gradle.kts
plugins {
    id("com.android.application")
}

// Fuerza todas las Kotlin stdlib a la 1.8.10
configurations.all {
    resolutionStrategy {
        force(
            "org.jetbrains.kotlin:kotlin-stdlib:1.8.10",
            "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.10",
            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10"
        )
    }
}

android {
    namespace = "com.inmalabs.edadcanina"
    compileSdk = 35

    buildFeatures{
        dataBinding = true
    }

    defaultConfig {
        applicationId = "com.inmalabs.edadcanina"
        minSdk = 29
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    // No kotlinOptions {}
    // No buildFeatures { compose = true }
}

dependencies {
    // AndroidX Core (Java)
    implementation("androidx.core:core:1.10.1")
    // AppCompat for Material widgets
    implementation("androidx.appcompat:appcompat:1.6.1")
    // Google Material Components
    implementation("com.google.android.material:material:1.9.0")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
