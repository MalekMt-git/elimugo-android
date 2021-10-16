package ngo.dean.elimugo.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.nav.controller.NavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                NavController(applicationContext = applicationContext)
            }
        }


    }
}