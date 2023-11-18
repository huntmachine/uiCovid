plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "example.demo.uicovid"
    compileSdk = 34

    defaultConfig {
        applicationId = "example.demo.uicovid"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes +="META-INF/DEPENDENCIES"
            excludes +="META-INF/AL2.0"
            excludes +="META-INF/LGPL2.1"
            excludes +="META-INF/mailcap.default"
            excludes +="xsd/catalog.xml"
            excludes +="META-INF/mimetypes.default"
            excludes +="META-INF/LICENSE.md"
            excludes +="META-INF/NOTICE.md"
            excludes +="META-INF/io.netty.versions.properties"
            excludes +="META-INF/INDEX.LIST"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.10.01"))
    implementation("androidx.compose.ui:ui:1.6.0-alpha08")
    implementation("androidx.compose.ui:ui-graphics:1.6.0-alpha08")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.0-alpha08")
    implementation("androidx.compose.material3:material3:1.2.0-alpha10")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.android.tools.build:gradle:8.1.2")
    implementation("jakarta.activation:jakarta.activation-api:2.1.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.01"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.0-alpha08")
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.4")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.0-alpha08")
}