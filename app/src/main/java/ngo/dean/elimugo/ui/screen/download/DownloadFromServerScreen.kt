package ngo.dean.elimugo.ui.screen.download

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.*
import ngo.dean.elimugo.R
import ngo.dean.elimugo.data.server.entites.Package
import ngo.dean.elimugo.data.server.api.Request
import ngo.dean.elimugo.ui.component.GuideLine
import ngo.dean.elimugo.ui.component.Toolbar

@Composable
fun DownloadFromServerScreen(context: Context) {
    Toolbar()
    DownloadFromServerScreenContent(context)
}

@OptIn(DelicateCoroutinesApi::class)
@Composable
fun DownloadFromServerScreenContent(context: Context) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
        //Todo @Malek Add a remove option in Explore Screen
        //Todo @Malek Add the advanced mode in the drawer/dashboard
    }
    val mutablePackageList = remember { mutableStateOf(arrayListOf<Package>()) }
    val queryUrlString = "content/packages.xml"
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
                Column() {

                    GlobalScope.launch (Dispatchers.IO) {
                    Request().query(context, queryUrlString) { listOfPackages ->
                            mutablePackageList.value = listOfPackages
                    }
                    }
                    LazyColumn {
                        items(mutablePackageList.value.size) { index ->
                            Spacer(modifier = Modifier.size(20.dp, 20.dp))
                            Row {

                                Button(onClick = {
                                    GlobalScope.launch (Dispatchers.IO) {
                                    Request().downloadPackages(listOf(mutablePackageList.value[index]), context)
                                    }
                                }){
                                    Icon(
                                        Icons.Filled.Download,
                                        contentDescription = stringResource(R.string.content_description),
                                        modifier = Modifier,
                                    )

                                    Text(
                                        with(mutablePackageList.value[index]){
                                           when (context.resources.configuration.locale.language){
                                               "en" ->  this.descriptions.en + " : " + this.size / 1000 + "KB"
                                               "sw" ->  this.descriptions.sw + " : " + this.size / 1000 + "KB"
                                               else -> this.descriptions.en + " : " + this.size / 1000 + "KB"
                                           }
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}