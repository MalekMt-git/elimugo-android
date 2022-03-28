package ngo.dean.elimugo.presentation.screen.download_screen

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
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext
import ngo.dean.elimugo.R
import ngo.dean.elimugo.domain.entites.Package
import ngo.dean.elimugo.data.server.api.Requests
import ngo.dean.elimugo.domain.usecase.GetPackagesUseCaseImpl
import ngo.dean.elimugo.presentation.component.GuideLine
import ngo.dean.elimugo.presentation.component.Toolbar

@Composable
fun DownloadFromServerScreen(context: Context) {
    Toolbar()
    DownloadFromServerScreenContent(context)
}

@Composable
fun DownloadFromServerScreenContent(context: Context) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
        //Todo @Malek Add a remove option in Explore Screen
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
                    MainScope().launch (Dispatchers.IO) {
                            GetPackagesUseCaseImpl(Requests(context)).invoke(queryUrlString){
                                MainScope().launch (Dispatchers.IO) {
                                    Requests(context).getPackageWithQuery(queryUrlString) { listOfPackages ->
                                        mutablePackageList.value = listOfPackages
                                    }
                                }
                            }
                        }
                    }
                    LazyColumn {
                        items(mutablePackageList.value.size) { index ->
                            Spacer(modifier = Modifier.size(20.dp, 20.dp))
                            Row {

                                Button(onClick = {
                                    MainScope().launch (Dispatchers.IO) {
                                    Requests(context).downloadPackages(listOf(mutablePackageList.value[index]))
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