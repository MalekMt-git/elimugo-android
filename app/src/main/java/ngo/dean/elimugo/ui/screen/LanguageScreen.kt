package ngo.dean.elimugo.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ngo.dean.elimugo.R


@Composable
fun Toolbar() {
    Scaffold(topBar = {
        TopAppBar(
            title = {

                Icon(
                    painter = painterResource(id = R.drawable.toolbar_logo),
                    contentDescription = "",
                    Modifier
                        .fillMaxWidth()
                        .fillMaxSize(0.5f),
                    Color.White
                )

            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Menu, "", modifier = Modifier, Color.White)
                }

            },

            actions = {

                Box(
                    Modifier
                        .wrapContentSize(Alignment.TopEnd)

                ) {
                    IconButton(onClick = {

                    }) {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = "Localized description",
                            modifier = Modifier,
                            Color.White
                        )
                    }

                }
            },

            backgroundColor = Color.Red

        )
    }, content = {

        Box(
            Modifier.fillMaxSize().padding(top = 10.dp)
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

        ) {


            Column(
                Modifier                .fillMaxSize()
                    .wrapContentSize(Alignment.Center)

            ) {
                Button(onClick = { /*TODO*/ } ,Modifier.size(230.dp , 110.dp).shadow(19.dp , shape = RoundedCornerShape(14))) {

                    Text(text = "KISWAHLI" , fontSize = 25.sp , fontWeight = FontWeight.ExtraBold , fontStyle = FontStyle.Normal)
                }
                
                Spacer(modifier = Modifier.size(40.dp))


                Button(onClick = { /*TODO*/ } ,Modifier.size(230.dp , 110.dp).shadow(19.dp , shape = RoundedCornerShape(14))) {
                    Text(text = "ENGLISH" , fontSize = 25.sp , fontWeight = FontWeight.ExtraBold , fontStyle = FontStyle.Normal)

                }
            }
        }
    })
}

@Composable
fun LanguageScreen(
    navController: NavController, context: Context
) {

    Toolbar()


}