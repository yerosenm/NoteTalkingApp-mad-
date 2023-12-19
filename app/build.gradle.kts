plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.notepadapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notepadapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Room for Database
    implementation ("androidx.room:room-runtime:2.2.5")
    annotationProcessor ("androidx.room:room-compiler:2.2.5")
    //RecyclerView
    implementation ("androidx.recyclerview:recyclerview:1.1.0")

    //scalable size unit(support for different size)
    implementation ("com.intuit.sdp:sdp-android:1.0.6")



    //material design
    implementation ("com.google.android.material:material:1.1.0")
    // rounded ImageView
    implementation ("com.makeramen:roundedimageview:2.3.0")


}