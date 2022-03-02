package ngo.dean.elimugo.presentation.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import ngo.dean.elimugo.presentation.nav.controller.NavController
import ngo.dean.elimugo.presentation.theme.ElimugoTheme

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ElimugoTheme {
                NavController(context = this)
            }
        }
    }
}