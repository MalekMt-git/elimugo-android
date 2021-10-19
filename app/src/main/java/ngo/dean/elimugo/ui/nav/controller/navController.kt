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
import ngo.dean.elimugo.ui.screen.MainScreen
import ngo.dean.elimugo.ui.screen.SplashScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavController(applicationContext: Context) {

    val navController = rememberAnimatedNavController()

    AnimatedNavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.route
    ) {
        composable(
            Routes.SplashScreen.route,
        ) {
            SplashScreen(navController = navController, applicationContext)
        }
        composable(

            Routes.LanguageScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            MainScreen(navController = navController, applicationContext)
        }

        composable(

            Routes.MainScreen.route,
            enterTransition = { initial, _ -> enterScreenFadeAnimation() },
        ) {

            MainScreen(navController = navController, applicationContext)
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
