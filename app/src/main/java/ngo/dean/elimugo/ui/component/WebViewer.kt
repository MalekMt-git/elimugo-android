package ngo.dean.elimugo.ui.component

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.StrictMode
import android.view.KeyEvent
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import androidx.navigation.NavController
import ngo.dean.elimugo.BuildConfig
import ngo.dean.elimugo.ui.nav.controller.Routes
import java.io.File
import java.net.URI

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewer(navController: NavController , urlToRender: String?) {
    var backEnabled by remember { mutableStateOf(false) }
    var webView: WebView? = null

    Box(modifier = Modifier.fillMaxSize()) {

        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )

                webViewClient = object : WebViewClient(){

                    override fun onPageStarted(view: WebView, url: String?, favicon: Bitmap?) {
                        backEnabled = view.canGoBack()
                    }

                    override fun onLoadResource(view: WebView?, url: String?) {
                        super.onLoadResource(view, url)
                        if (url != null) {
                            if (url.contains(".pdf")){
                                val builder =  StrictMode.VmPolicy.Builder()
                                StrictMode.setVmPolicy(builder.build())
                                builder.detectFileUriExposure()

                               val file = FileProvider.getUriForFile(context, BuildConfig.APPLICATION_ID + ".provider", File(
                                   URI.create(url)))
                                val intent = Intent(Intent.ACTION_VIEW, file)
                                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                                startActivity(context , intent , null)
                            }
                        }
                    }
                }

                this.settings.allowContentAccess = true
                this.settings.allowFileAccess = true
                this.settings.javaScriptEnabled = true
                this.settings.allowUniversalAccessFromFileURLs = true
                this.settings.allowFileAccessFromFileURLs = true
                this.settings.javaScriptCanOpenWindowsAutomatically = true
                if (urlToRender != null) {
                    loadUrl(urlToRender)
                }
                webView = this

            }
        }, update = {
            if (urlToRender != null) {
                webView = it
            }
        })
        BackHandler(enabled = backEnabled) {
            webView?.goBack()
        }
    }
}

