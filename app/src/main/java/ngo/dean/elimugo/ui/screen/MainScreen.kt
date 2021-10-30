package ngo.dean.elimugo.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ngo.dean.elimugo.ui.Toolbar
import ngo.dean.elimugo.ui.nav.controller.Routes

@Composable
fun MainScreen(navController: NavController, context: Context) {

    Toolbar()

    Content(navController = navController)

}

@Composable
fun Content(
    navController: NavController
) {

    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 70.dp)
    ) {

        Text(
            text = "Select a Language",
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
                contentDescription = "Localized description",
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
                            text = "Share",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Normal,
                            modifier = Modifier.align(TopCenter)
                        )

                        Icon(
                            Icons.Filled.MobileScreenShare,
                            contentDescription = "Localized description",
                            modifier = Modifier.align(Center).size(80.dp),
                            Color.White

                        )

                        Text(
                            text = "Share ElimuGo Content to Another Device ",
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

                        navController.navigate(Routes.MainScreen.route)

                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {

                    Text(
                        text = "Download",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Normal
                    )
                }

            }

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
                    Text(
                        text = "Explore",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Normal
                    )

                }

                Spacer(modifier = Modifier.size(10.dp, 0.dp))

                Button(
                    onClick = {

                        navController.navigate(Routes.MainScreen.route)

                    },
                    Modifier
                        .size(180.dp, 180.dp)
                        .shadow(19.dp, shape = RoundedCornerShape(4))
                ) {
                    Text(
                        text = "ElimuGo",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Normal
                    )

                }
            }

        }
    }

}