package ngo.dean.elimugo.ui.screen

import android.content.Context
import android.view.WindowManager
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.theme.ElimugoTheme

@Composable
fun SplashScreen(navController: NavController, context: Context) {

    ElimugoTheme {
        SplashScreenView()
    }
}

@Composable
fun SplashScreenView(){

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
}