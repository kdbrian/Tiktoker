buildscript {
    dependencies {
        classpath(libs.secrets.gradle.plugin)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.google.gms.google.services) apply false
    id ("io.realm.kotlin") version "3.0.0" apply false


}