package ngo.dean.elimugo.ui.screen.download

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.data.server.Request
import ngo.dean.elimugo.ui.Toolbar

@Composable
fun DownloadFromServerScreen(navController: NavController, activity: Activity) {
    Toolbar()
    DownloadFromServerScreenContent(navController = navController, activity)
}

@Composable
fun DownloadFromServerScreenContent(
    navController: NavController, activity: Activity
) {
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
                    val mutablePackagesName = remember { mutableStateOf(arrayListOf<String>()) }
                    var packages = arrayListOf<String>()
                    Request().query(activity, queryUrlString) {
                        mutablePackagesName.value = it!!
                    }
                    LazyColumn {
                        items(mutablePackagesName.value.size) { index ->
                            Spacer(modifier = Modifier.size(20.dp, 20.dp))
                            val checkedState = remember { mutableStateOf(false) }
                            Row {
                                Checkbox(
                                    checked = checkedState.value,
                                    onCheckedChange = { checkedState.value = it },
                                )
                                Spacer(modifier = Modifier.size(10.dp, 0.dp))

                                Text(
                                    mutablePackagesName.value[index]
                                )
                                if (checkedState.value) {
                                    packages.add(mutablePackagesName.value[index])
                                } else if (packages.isNotEmpty()) {
                                    try {
                                        packages.removeAt(index)
                                    } catch (e: Throwable) {
                                        packages.clear()
                                    }
                                }
                            }
                            Log.i(
                                "TAAAG", packages.toString()
                            )
                        }
                    }


                }
            }
        }
        FloatingActionButton(onClick = {

        }, modifier = Modifier.align(Alignment.BottomEnd).padding(20.dp)) {
            /* FAB content */
            Icon(
                Icons.Filled.Download,
                contentDescription = stringResource(R.string.content_description),
                modifier = Modifier,
                Color.White
            )

        }
    }

}