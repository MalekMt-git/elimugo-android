package ngo.dean.elimugo.ui.screen

import android.app.Activity
import android.app.DownloadManager
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MobileScreenShare
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.Toolbar
import ngo.dean.elimugo.ui.nav.controller.Routes
import ngo.dean.elimugo.ui.theme.ElimugoTheme

@Composable
fun DownloadScreen(navController: NavController, activity: Activity) {
    Toolbar()
    DownloadScreenContent(navController = navController , activity)
}

@Composable
fun DownloadScreenContent(
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
                .align(TopCenter)
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
            .wrapContentSize(Center)
            .padding(top = 120.dp)
    ) {

        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Center)
        ) {
            Row(Modifier.padding(10.dp)) {

                Spacer(modifier = Modifier.size(0.dp, 0.dp))

                Button(
                    onClick = {
                        navController.navigate(Routes.MainScreen.route)
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

                ElimugoTheme(downloadScreenThemeColors = true) {


                Button(
                    onClick = {

                        navController.navigate(Routes.DownloadFromServerScreen.route)

                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(
                            19.dp, shape = RoundedCornerShape(4)
                        )
                ) {

                    Box(Modifier.fillMaxHeight()) {

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
                            text = stringResource(R.string.downlaod_from_server_content),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(BottomCenter)
                        )
                    }
                }
            }
            }
/*            Row(Modifier.padding(10.dp)) {

                Spacer(modifier = Modifier.size(0.dp, 0.dp))

                Button(
                    onClick = {

                        navController.navigate(Routes.MainScreen.route)

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

            }*/
        }
    }
}