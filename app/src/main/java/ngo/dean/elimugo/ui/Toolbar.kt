package ngo.dean.elimugo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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



    })
}