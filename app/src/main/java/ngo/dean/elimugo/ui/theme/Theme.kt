package ngo.dean.elimugo.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightThemeColors = lightColors(
    primary = Red,
    primaryVariant = White,
)

@Composable
fun ElimugoTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors =  LightThemeColors,
        typography = JetnewsTypography,
        shapes = JetnewsShapes,
        content = content
    )
}