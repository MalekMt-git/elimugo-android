package ngo.dean.elimugo.ui.nav.controller

import android.app.Activity
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

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavController(activity: Activity) {

    val navController = rememberAnimatedNavController()

    AnimatedNavHost(
        navController = navController,
        startDestination = Routes.DownloadFromServerScreen.route
    ) {
        composable(
            Routes.SplashScreen.route,
        ) {
            SplashScreen(navController = navController, activity)
        }
        composable(

            Routes.LanguageScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            LanguageScreen(navController = navController, activity)
        }

        composable(

            Routes.MainScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            MainScreen(navController = navController, activity)
        }

        composable(

            Routes.DownloadScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            DownloadScreen(navController = navController, activity)
        }
        composable(

            Routes.DownloadFromServerScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            DownloadFromServerScreen(navController = navController, activity)
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun enterScreenFadeAnimation(): EnterTransition {
    return fadeIn(
        initialAlpha = 0.3f,
        animationSpec = tween(
            1000,
            500,
            easing = CubicBezierEasing(0.8f, 0.9f, 0.09f, 1.0f)
        )
    )
}
