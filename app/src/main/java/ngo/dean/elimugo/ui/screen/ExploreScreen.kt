package ngo.dean.elimugo.ui.screen

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import android.webkit.MimeTypeMap
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.component.GuideLine
import ngo.dean.elimugo.ui.component.Toolbar
import ngo.dean.elimugo.ui.component.WebView
import ngo.dean.elimugo.util.xml.XmlParser
import java.io.File
import java.io.FileInputStream
import java.util.*

@Composable
fun ExploreScreen(context: Context) {
    Toolbar()
    ExploreScreenContent(context)
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExploreScreenContent(context: Context) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
    }
    var webView by remember { mutableStateOf("") }

    if (webView != ""){
        WebView(urlToRender = webView)
    }
    Box(
        Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(top = 120.dp)
    ) {
        fun File.getMimeType(fallback: String = "*/*"): String {
            return MimeTypeMap.getFileExtensionFromUrl(toString())
                ?.run { MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowercase(Locale.getDefault())) }
                ?: fallback // You might set it to */*
        }
        LazyColumn {

            val directory = File(context.getExternalFilesDir(null), "Public")
            val language = context.resources.configuration.locale.language
            if (directory.listFiles() != null && webView == "" ) {
                val files: Array<File> = directory.listFiles()
                items(files.size) { index ->
                    if (files[index].name != "packages.xml"){
                    Button(onClick = {
                        try {
                            val indexFile = File(context.getExternalFilesDir("Public") ,files[index].name + "/" + language + "/"+ "index.html" )
                            if ( indexFile.exists() && indexFile.getMimeType() == "text/html" ){
                                webView = indexFile.absolutePath
                            }else{
                                val intent = Intent(Intent.ACTION_VIEW)
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK;
                                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                intent.setDataAndType(FileProvider.getUriForFile(context ,context.applicationContext.packageName + ".provider" , indexFile), indexFile.getMimeType() )
                                startActivity( context, intent , null)
                            }
                        } catch (e: ActivityNotFoundException) {
                            // no Activity to handle this kind of files
                        }
                    }, content = {
                            val packagesFile =
                                File(context.getExternalFilesDir("Public"), "packages.xml")
                        if (packagesFile.exists()){
                            val packages = XmlParser().parsePackages(
                                FileInputStream(packagesFile).bufferedReader().readText()
                                    .toByteArray().inputStream()
                            )
                            for (i in packages) {
                                if (i.uniqueId == files[index].name) {
                                    when (language) {
                                        "en" -> i.descriptions.en
                                        "sw" -> i.descriptions.sw
                                        else -> i.descriptions.en
                                    }?.let {
                                        if (it.isNotEmpty()) {
                                            Text(
                                                text = it,
                                                Modifier.padding(13.dp, 13.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    })
                    Spacer(modifier = Modifier.size(0.dp, 30.dp))
                    }}
            } else if (webView == "") {
                item {
                    Text(text = stringResource(R.string.nothing_downloaded))
                }
            }
        }
    }
}