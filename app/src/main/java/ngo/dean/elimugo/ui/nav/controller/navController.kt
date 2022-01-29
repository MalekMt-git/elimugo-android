package ngo.dean.elimugo.ui.nav.controller

import android.content.Context
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import ngo.dean.elimugo.ui.screen.*
import ngo.dean.elimugo.ui.screen.download.DownloadFromServerScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavController(context: Context) {

    val navController = rememberAnimatedNavController()

    AnimatedNavHost(
        navController = navController,
        startDestination = Routes.DownloadFromServerScreen.route
    ) {
        composable(
            Routes.SplashScreen.route,
        ) {
            SplashScreen(navController = navController)
        }
        composable(

            Routes.LanguageScreen.route,
            enterTransition = { _, _ -> enterScreenFadeAnimation() },
        ) {

            LanguageScreen(navController = navController, context)
        }

        composable(

            Routes.MainScreen.route,
            enterTransition = { _, _ -> enterScreenFadeAnimation() },
        ) {

            MainScreen(navController = navController, context)
        }
        composable(

            Routes.DownloadFromServerScreen.route,
            enterTransition = { _, _ -> enterScreenFadeAnimation() },
        ) {

            DownloadFromServerScreen(context)
        }
        composable(

            Routes.ExploreScreen.route,
            enterTransition = { _, _ -> enterScreenFadeAnimation() },
        ) {

            ExploreScreen(context)
        }
        composable(

            Routes.ShareDataScreen.route,
            enterTransition = { _, _ -> enterScreenFadeAnimation() },
        ) {

            ShareDataScreen(navController = navController, context)
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun enterScreenFadeAnimation(): EnterTransition {
    return fadeIn(
        initialAlpha = 0.0f,
        animationSpec = tween(
            1000,
            500,
            easing = CubicBezierEasing(0.8f, 0.9f, 0.09f, 1.0f)
        )
    )
}
