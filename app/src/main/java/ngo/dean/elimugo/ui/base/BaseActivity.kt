package ngo.dean.elimugo.ui.base

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.compose.setContent
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.nav.controller.NavController
import ngo.dean.elimugo.ui.theme.ElimugoTheme

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElimugoTheme {
                setStatusBar()
                NavController(activity = this)
            }
        }
    }
    private fun setStatusBar(){
        val window = this.window
        val background: Drawable = this.resources.getDrawable(R.drawable.gradient_theme)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = this.resources.getColor(R.color.colorSelection)
        window.navigationBarColor = this.resources.getColor(R.color.black_colorShadowBeginning)
        window.setBackgroundDrawable(background)
    }
}