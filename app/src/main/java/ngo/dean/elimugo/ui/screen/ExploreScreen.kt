package ngo.dean.elimugo.ui.screen

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.webkit.MimeTypeMap
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.Toolbar
import java.io.File
import java.util.*


@Composable
fun ExploreScreen(navController: NavController, activity: Activity) {
    Toolbar()
    ExploreScreenContent(navController, activity)
}


@Composable
fun ExploreScreenContent(navController: NavController, activity: Activity) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 70.dp)
    ) {
        Text(
            text = stringResource(R.string.main_screen_toolbar_title),
            Modifier
                .align(Alignment.TopCenter)
                .padding(top = 13.dp)
        )
        IconButton(
            onClick = {
            },
            Modifier.align(AbsoluteAlignment.TopRight),
        ) {
            Icon(
                Icons.Filled.Info,
                contentDescription = stringResource(R.string.content_description),
                modifier = Modifier,
                Color.Black
            )
        }
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
            val directory = File(activity.getExternalFilesDir(null), "Elimugo")
            if (directory.listFiles() != null) {

                val files: Array<File> = directory.listFiles()

                items(files.size) { index ->

                    Button(onClick = {

                        try {
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK;
                            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                            //   intent.setDataAndType(Uri.fromFile(files[index]), files[index].getMimeType() )
                            intent.setDataAndType(FileProvider.getUriForFile(activity ,activity.applicationContext.packageName + ".provider" , files[index]), files[index].getMimeType() )
                            startActivity( activity, intent , null)
                        } catch (e: ActivityNotFoundException) {
                            // no Activity to handle this kind of files
                        }

                    }, content = {
                        Text(
                            text = files[index].name, Modifier
                                .padding(13.dp, 13.dp)
                        )
                    })
                    Spacer(modifier = Modifier.size(0.dp, 30.dp))
                }


            } else {
                item {
                    Text(text = stringResource(R.string.nothing_downloaded))
                }
            }


        }

    }


}