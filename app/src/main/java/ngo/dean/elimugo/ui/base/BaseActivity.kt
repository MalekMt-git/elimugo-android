package ngo.dean.elimugo.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import ngo.dean.elimugo.ui.nav.controller.NavController
import ngo.dean.elimugo.ui.theme.ElimugoTheme

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElimugoTheme {
                NavController(applicationContext = applicationContext)
            }
        }
    }
}