package ngo.dean.elimugo.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.Toolbar
import ngo.dean.elimugo.ui.nav.controller.Routes

@Composable
fun LanguageScreen(
    navController: NavController, context: Context
) {

    Toolbar()

    Content(navController = navController, context = context)
}

@Composable
fun Content(
    navController: NavController, context: Context
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

    ) {

        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)

        ) {
            Button(
                onClick = {

                    navController.navigate(Routes.MainScreen.route)

                },
                Modifier
                    .size(230.dp, 140.dp)
                    .shadow(19.dp, shape = RoundedCornerShape(4))
            ) {

                Text(
                    text = "KISWAHLI",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Normal
                )
            }

            Spacer(modifier = Modifier.size(40.dp))


            Button(
                onClick = {

                    navController.navigate(Routes.MainScreen.route)

                },
                Modifier
                    .size(230.dp, 140.dp)
                    .shadow(19.dp, shape = RoundedCornerShape(4))
            ) {
                Text(
                    text = "ENGLISH",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Normal
                )

            }
        }
    }

}