package ngo.dean.elimugo.presentation.screen.download_screen

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.*
import ngo.dean.elimugo.R
import ngo.dean.elimugo.domain.entites.Package
import ngo.dean.elimugo.data.server.api.Requests
import ngo.dean.elimugo.domain.usecase.GetPackagesUseCaseImpl
import ngo.dean.elimugo.domain.usecase.PackageUseCase
import ngo.dean.elimugo.presentation.component.GuideLine
import ngo.dean.elimugo.presentation.component.Toolbar
import ngo.dean.elimugo.util.xml.XmlParser

@Composable
fun DownloadFromServerScreen(context: Context) {
    Toolbar()
    DownloadFromServerScreenContent(context)
}

@Composable
fun DownloadFromServerScreenContent(context: Context) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
    }
    val mutablePackageList = remember { mutableStateOf(arrayListOf<Package>()) }
    val mutableLocalPackageList = remember { mutableStateOf(arrayListOf<Package>()) }
    val itemCount: MutableState<Int> = remember { mutableStateOf(0) }
    val progress = remember {  mutableStateOf(0.0f) }
    var clickedItemIndex = -1
    XmlParser().getLocalPackages(context , onSuccess = {
        mutableLocalPackageList.value = it
    }, onFailed = {
        Log.e("Error" , it)
    })

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
                    }
                    LazyColumn {
                        if (mutableLocalPackageList.value.size > 0) {
                            mutablePackageList.value = PackageUseCase().getListOfNewPackages(
                                onlinePackageList = mutablePackageList.value,
                                localPackageList = mutableLocalPackageList.value,
                                context
                            )
                        }
                            itemCount.value = mutablePackageList.value.size

                        if (itemCount.value > 0) {
                            items(itemCount.value) { index ->
                            Spacer(modifier = Modifier.size(20.dp, 20.dp))
                            Row {


                                Button(onClick = {
                                    MainScope().launch (Dispatchers.IO) {
                                        val currentPackage = mutablePackageList.value[index]
                                    Requests(context).downloadPackages(listOf(currentPackage) , progress)
                                        mutablePackageList.value.removeAt(index)
                                        itemCount.value = itemCount.value -1
                                        clickedItemIndex = index
                                    }
                                }){
                                    val iterator = mutablePackageList.value.iterator()
                                    while (iterator.hasNext()){
                                        val item = iterator.next()
                                        if (item.uniqueId == mutablePackageList.value[index].uniqueId){
                                            Icon(
                                                Icons.Filled.Download,
                                                contentDescription = stringResource(R.string.content_description),
                                                modifier = Modifier,
                                            )
                                            Column {
                                                Row {
                                                    Text(
                                                        with(mutablePackageList.value[index]){
                                                            when (context.resources.configuration.locale.language){
                                                                "en" ->  (this.descriptions.en).toString()
                                                                "sw" ->  (this.descriptions.sw).toString()
                                                                else ->  (this.descriptions.en).toString()
                                                            }
                                                        }
                                                    )
                                                }
                                                Row{
                                                    Text(
                                                        with(mutablePackageList.value[index]){
                                                            stringResource(R.string.size) + " : " + (this.size / 1000).toString() + "KB"
                                                        }
                                                    )
                                                }
/*                                                if (clickedItemIndex > -1){
                                                    LinearProgressIndicator(
                                                        backgroundColor = Color.White,
                                                        progress = progress.value,
                                                        color = Color.Green)
                                                }
                                                clickedItemIndex = -1*/
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                        else {
                            item {
                                Text(text = stringResource(R.string.no_new_package))
                            }
                        }
                }
            }
        }
    }