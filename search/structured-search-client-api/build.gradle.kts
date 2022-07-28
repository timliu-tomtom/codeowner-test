/*
 * © 2022 TomTom NV. All rights reserved.
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

val artifactId by extra("structured-search-client-api")

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

val nextSdkVersion: String by project

dependencies {
    // Internal
    api(projects.search.common)
    api(projects.common.core)

    // AndroidX
    implementation(libs.androidx.coreKtx)
}
