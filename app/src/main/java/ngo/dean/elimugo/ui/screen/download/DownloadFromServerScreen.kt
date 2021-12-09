package ngo.dean.elimugo.ui.screen

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ngo.dean.elimugo.R
import ngo.dean.elimugo.data.server.Request
import ngo.dean.elimugo.ui.Toolbar
import ngo.dean.elimugo.util.xml.NetworkActivity
import ngo.dean.elimugo.util.xml.XmlParser

@Composable
fun DownloadFromServerScreen(navController: NavController, activity: Activity) {
    Toolbar()
    DownloadFromServerScreenContent(navController = navController , activity)
}

@Composable
fun DownloadFromServerScreenContent(
    navController: NavController , activity: Activity
) {


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

        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            Row(Modifier.padding(10.dp)) {



                Column(){
                    var txt by remember { mutableStateOf("") }


                    if (txt.isNotEmpty()) {
                        Text(
                            text = "$txt!",
                            modifier = Modifier.padding(bottom = 8.dp),
                            style = MaterialTheme.typography.h5
                        )
                    }


                    val downloadurl =  "https://www.elimupi.online/content/packages.xml"


                    val q = "content/developmentHtmlLearnNeoBartitsu/index.xml"

   /*                 GlobalScope.launch {
                        val txtaaa = NetworkActivity().downloadUrl(downloadurl)
                        if (txtaaa != null) {
                            Log.i("TAG" , XmlParser().parse(txtaaa).toString())
                        }


                    }*/



                    Request().query(activity , q) {


                        txt = it.toString()



                      //  txt = XmlParser().parse(targetStream).toString()
                    }

                }

/*                LazyColumn() {
                    items(5) { index ->
                        Text(text = "Item: $index")
                    }

                                    }*/

            }
        }
    }

}