package ngo.dean.elimugo.ui.screen

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.ButtonDefaults.ContentPadding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.MobileScreenShare
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.component.ElimuGoButton
import ngo.dean.elimugo.ui.component.GuideLine
import ngo.dean.elimugo.ui.component.Toolbar
import ngo.dean.elimugo.ui.nav.controller.Routes
import ngo.dean.elimugo.util.ShareAPK
import org.monora.uprotocol.client.android.activity.HomeActivity

@Composable
fun MainScreen(navController: NavController, activity: Activity) {
    Toolbar()
    MainScreenContent(navController = navController , activity)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreenContent(
    navController: NavController , context: Context
) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        //TODO @Malek
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
    }


    Box(
        modifier=Modifier.fillMaxSize()
    ) {

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier.align(Center).padding(horizontal = 10.dp).padding(top = 40.dp)
        ) {
            item {
                ElimuGoButton(title = stringResource(R.string.share_btn_title)
                    , icon = painterResource(id = R.drawable.share_logo),
                    description = stringResource(R.string.share_btn_content)){
                    startActivity(context,Intent(context, HomeActivity::class.java) ,null)
                }
            }
            item {
                ElimuGoButton(title = stringResource(R.string.download_btn_title)
                    , icon = painterResource(id = R.drawable.download_logo),
                    description = stringResource(R.string.download_btn_content)){
                    navController.navigate(Routes.DownloadFromServerScreen.route)
                }
            }
            item {
                ElimuGoButton(title = stringResource(R.string.explore)
                    , icon = painterResource(id = R.drawable.explore_logo),
                    description = stringResource(R.string.explore_content)){
                    navController.navigate(Routes.ExploreScreen.route)
                }
            }
            item {
                ElimuGoButton(title = stringResource(R.string.elimugo)
                    , icon = painterResource(id = R.drawable.elimugo_mainscreen_logo),
                    description = stringResource(R.string.elimugo_btn_content)){
                    ShareAPK().share(context)
                }
            }
        }
        
/*        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Center)
        ) {
            Row(Modifier.padding(10.dp)) {

                Spacer(modifier = Modifier.size(0.dp, 0.dp))

                Button(
                    onClick = {
                        ///navController.navigate(Routes.ShareDataScreen.route)
                        val intent = Intent(context, HomeActivity::class.java)
                        startActivity(context,intent , null)
                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {

                    Box(Modifier.fillMaxSize()) {

                        Text(
                            text = stringResource(R.string.share_btn_title),
                            fontSize = 23.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(TopCenter)
                        )

                        Icon(
                            Icons.Filled.MobileScreenShare,
                            contentDescription = stringResource(R.string.content_description),
                            modifier = Modifier
                                .align(Center)
                                .size(80.dp),
                            Color.White
                        )

                        Text(
                            text = stringResource(R.string.share_btn_content),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(BottomCenter)
                        )
                    }
                }

                Spacer(modifier = Modifier.size(10.dp, 0.dp))

                Button(
                    onClick = {

                        navController.navigate(Routes.DownloadFromServerScreen.route)

                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {

                    Box(Modifier.fillMaxSize()) {

                        Text(
                            text = stringResource(R.string.download_btn_title),
                            fontSize = 23.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(TopCenter)
                        )

                        Icon(
                            Icons.Filled.CloudDownload,
                            contentDescription = stringResource(R.string.content_description),
                            modifier = Modifier
                                .align(Center)
                                .size(80.dp),
                            Color.White
                        )

                        Text(
                            text = stringResource(R.string.download_btn_content),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(BottomCenter)
                        )
                    }
                }
            }

            Row(Modifier.padding(10.dp)) {

                Spacer(modifier = Modifier.size(0.dp, 0.dp))

                Button(
                    onClick = {

                        navController.navigate(Routes.ExploreScreen.route)

                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {

                    Box(Modifier.fillMaxSize()) {

                        Text(
                            text = stringResource(R.string.explore),
                            fontSize = 23.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(TopCenter)
                        )

                        Icon(
                            Icons.Filled.TravelExplore,
                            contentDescription = stringResource(R.string.content_description),
                            modifier = Modifier
                                .align(Center)
                                .size(80.dp),
                            Color.White
                        )

                        Text(
                            text = stringResource(R.string.explore_content),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(BottomCenter)
                        )
                    }
                }

                Spacer(modifier = Modifier.size(10.dp, 0.dp))

                Button(
                    onClick = {
                        ShareAPK().share(context)
                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {

                    Box(Modifier.fillMaxSize()) {

                        Text(
                            text = stringResource(R.string.elimugo),
                            fontSize = 23.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(TopCenter)
                        )

                        Icon(
                            painter = painterResource(id = R.drawable.toolbar_logo),
                            contentDescription = stringResource(R.string.content_description),
                            modifier = Modifier
                                .align(Center)
                                .size(180.dp),
                            Color.White
                        )

                        Text(
                            text = stringResource(R.string.elimugo_btn_content),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(BottomCenter)
                        )
                    }
                }
            }
        }*/
    }
}