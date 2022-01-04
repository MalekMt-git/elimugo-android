package ngo.dean.elimugo.ui.screen

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Animatable
import android.view.WindowManager
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.nav.controller.Routes
import ngo.dean.elimugo.ui.theme.ElimugoTheme

@Composable
fun SplashScreen(navController: NavController, context: Context) {

    ElimugoTheme {
        SplashScreenView(navController,context)
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun SplashScreenView(navController: NavController, context: Context){

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.splash_screen_logo),
            contentDescription = "Logo",
            modifier = Modifier.scale(1.0f)
        )
    }

    val animatedFloat = remember { (0f) }

    LaunchedEffect(animatedFloat) {
        delay(1000)

        navController.navigate(Routes.LanguageScreen.route)
    }
}