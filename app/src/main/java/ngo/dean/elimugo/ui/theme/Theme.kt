package ngo.dean.elimugo.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ngo.dean.elimugo.ui.nav.controller.Routes

private val LightThemeColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red700,
    secondaryVariant = Red900,
    onSecondary = Color.White,
    error = Red800
)

@SuppressLint("ConflictingOnColor")
private val DarkThemeColors = darkColors(
    primary = Red300,
    primaryVariant = Red700,
    onPrimary = Color.Black,
    secondary = Red300,
    onSecondary = Color.White,
    error = Red200
)

private val DownloadScreenThemeColors = lightColors(
    primary = Blue900,
    primaryVariant = Blue900,
    onPrimary = Color.White,
    secondary = Blue900,
    onSecondary = Color.White,
    error = Blue900,
)

@Composable
fun ElimugoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    downloadScreenThemeColors: Boolean =false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkThemeColors else if (downloadScreenThemeColors) DownloadScreenThemeColors else LightThemeColors,
        typography = JetnewsTypography,
        shapes = JetnewsShapes,
        content = content
    )
}