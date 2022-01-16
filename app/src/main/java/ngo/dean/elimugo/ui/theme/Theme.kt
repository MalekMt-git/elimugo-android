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
    primary = Red,
    primaryVariant = Red,
    secondary = Red,
    secondaryVariant = Red,
    error = Red
)

private val DarkThemeColors = darkColors(
    primary = Red,
    primaryVariant = Red,
    secondary = Red,
    error = Red
)

private val DownloadScreenThemeColors = lightColors(
    primary = Red,
    primaryVariant = Red,
    secondary = Red,
    error = Red,
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