package ngo.dean.elimugo.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import ngo.dean.elimugo.R
import ngo.dean.elimugo.presentation.nav.controller.Routes
import ngo.dean.elimugo.presentation.theme.ElimugoTheme

@Composable
fun SplashScreen(navController: NavController) {

    ElimugoTheme {
        SplashScreenView(navController)
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun SplashScreenView(navController: NavController){

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(Color.White)
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