package ngo.dean.elimugo.ui.screen.download

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.data.server.Package
import ngo.dean.elimugo.data.server.Request
import ngo.dean.elimugo.ui.Toolbar
import java.io.File

@Composable
fun DownloadFromServerScreen(navController: NavController, activity: Activity) {
    Toolbar()
    DownloadFromServerScreenContent(navController = navController, activity)
}

@Composable
fun DownloadFromServerScreenContent(
    navController: NavController, activity: Activity
) {
    val mutablePackageList = remember { mutableStateOf(arrayListOf<Package>()) }
    val choosedPackagesToDownload =  remember { mutableStateOf(ArrayList<Package>()) }

    val queryUrlString = "content/package" +
            "s.xml"
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
                Column() {

                    Request().query(activity, queryUrlString) {listOfPackages ->
                            mutablePackageList.value = listOfPackages
                    }
                    LazyColumn {
                        items(mutablePackageList.value.size) { index ->
                            Spacer(modifier = Modifier.size(20.dp, 20.dp))
                            val checkedState = remember { mutableStateOf(false) }
                            Row {
                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = {
                                        checkedState.value = it
                                        if (checkedState.value){
                                            choosedPackagesToDownload.value.add(mutablePackageList.value[index])
                                        } else{
                                            choosedPackagesToDownload.value.removeAt(index)
                                        }
                                        },
                                )
                                Spacer(modifier = Modifier.size(10.dp, 0.dp))

                                Text(
                                    with(mutablePackageList.value[index]){
                                       this.uniqueId + " : " + this.size / 1000 + "KB"
                                    }
                                )

                            }
                            Log.i(
                                "TAAAG", choosedPackagesToDownload.value.toString()
                            )
                        }
                    }


                }
            }
        }
        FloatingActionButton(onClick = {
                                       Request().download(choosedPackagesToDownload.value, activity)
        }, modifier = Modifier.align(Alignment.BottomEnd).padding(20.dp)) {
            Icon(
                Icons.Filled.Download,
                contentDescription = stringResource(R.string.content_description),
                modifier = Modifier,
                Color.White
            )

        }
    }

}