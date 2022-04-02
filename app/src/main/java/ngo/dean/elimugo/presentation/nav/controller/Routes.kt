package ngo.dean.elimugo.presentation.nav.controller

import android.annotation.SuppressLint

sealed class Routes(val route: String) {
    @SuppressLint("CustomSplashScreen")
    object SplashScreen : Routes( "SplashScreen")
    object LanguageScreen : Routes( "LanguageScreen")
    object MainScreen : Routes( "MainScreen")
    object ExploreScreen : Routes( "ExploreScreen")
    object DownloadFromServerScreen : Routes( "DownloadFromServerScreen")
    object MainDownloadScreen : Routes( "MainDownloadScreen")
    object ShareDataScreen : Routes( "ShareDataScreen")
    object WebViewer : Routes( "WebViewer")
}
