package ngo.dean.elimugo.ui.nav.controller

import android.annotation.SuppressLint

sealed class Routes(val route: String) {
    @SuppressLint("CustomSplashScreen")
    object SplashScreen : Routes( "SplashScreen")
    object LanguageScreen : Routes( "LanguageScreen")
    object MainScreen : Routes( "MainScreen")
}
