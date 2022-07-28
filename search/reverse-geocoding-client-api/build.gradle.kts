/*
 * © 2021 TomTom NV. All rights reserved.
 *
 * This software is the proprietary copyright of TomTom NV and its subsidiaries and may be
 * used for internal evaluation purposes or commercial use strictly subject to separate
 * license agreement between you and TomTom NV. If you are the licensee, you are only permitted
 * to use this software in accordance with the terms of your license agreement. If you are
 * not the licensee, you are not authorized to use this software in any manner and should
 * immediately return or destroy it.
 */

import com.android.builder.core.BuilderConstants

plugins {
    id(BuildPlugins.COMMON_ANDROID_LIBRARY)
    id(BuildPlugins.DOKKA)
    id(BuildPlugins.METALAVA)
    kotlin(BuildPlugins.KOTLIN_SERIALIZATION)
}

val artifactId by extra("reverse-geocoding-client-api")

android {
    buildTypes {
        getByName(BuilderConstants.RELEASE) {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
                rootProject.file(Const.PROGUARD_LOGGING_RULES)
            )
        }
    }
}

apply(plugin = BuildPlugins.PUBLISHER)

dependencies {
    // Internal
    api(projects.common.core)
    api(projects.common.functional)
    api(projects.search.common)
    implementation(projects.common.coroutines)

    // AndroidX
    implementation(libs.androidx.coreKtx)
    implementation(libs.androidx.appCompat)

    // Kotlin
    implementation(libs.kotlin.stdLib)
    implementation(libs.kotlin.jsonSerialization)
    implementation(libs.kotlin.coroutines)

    // Others
    implementation(libs.thirdparty.timber)
    implementation(libs.thirdparty.okhttp)

    // Tests
    testImplementation(projects.testing.jvm)

    androidTestImplementation(projects.testing.instrumented)
}
