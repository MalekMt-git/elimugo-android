package ngo.dean.elimugo.ui.component


import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebView(urlToRender: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        AndroidView(factory = {
            WebView(it).apply {
                webViewClient = WebViewClient()
                loadUrl(urlToRender)
                this.settings.allowContentAccess = true
                this.settings.allowFileAccess = true
                this.settings.javaScriptEnabled = true
            }

        }, update = {
            it.loadUrl(urlToRender)
        })
    }
}