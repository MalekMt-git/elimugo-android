package ngo.dean.elimugo.ui.screen

import android.content.Context
import android.provider.Settings.Global.getString
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.component.GuideLine
import ngo.dean.elimugo.ui.component.Toolbar
import ngo.dean.elimugo.ui.nav.controller.Routes
import java.util.*

@Composable
fun LanguageScreen(
    navController: NavController, context: Context
) {
    val sharedPref = context.getSharedPreferences(getString(context.contentResolver
        ,context.resources.getString(R.string.app_name)), Context.MODE_PRIVATE)

    val config = context.resources.configuration

    if (sharedPref.contains("app_language")) {
        config.locale = Locale(sharedPref.getString("app_language", "en"))
        context.resources.updateConfiguration(config, context.resources.displayMetrics)
        navController.navigate(Routes.MainScreen.route)
    }else{
        Toolbar()
        Content(navController = navController, context = context)
    }
}

@Composable
fun Content(
    navController: NavController, context: Context
) {
    val sharedPref = context.getSharedPreferences(getString(context.contentResolver
        ,context.resources.getString(R.string.app_name)), Context.MODE_PRIVATE)

    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        //TODO @Malek
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
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
                    with (sharedPref.edit()) {
                        putString("app_language", "sw")
                        apply()
                    }
                    navController.navigate(Routes.MainScreen.route)
                },
                Modifier
                    .size(260.dp, 110.dp)
                    .shadow(15.dp, shape = RoundedCornerShape(13))
            ) {
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment  =  Alignment.Start){
                    Text(
                        text = "KISWAHLI",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 5.dp , bottom = 15.dp)
                    )
                    Text(
                        text = "Endelea kwa kiswahili",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Light,
                    )
                }
            }

            Spacer(modifier = Modifier.size(40.dp))

            Button(
                onClick = {
                    with (sharedPref.edit()) {
                        putString("app_language", "en")
                        apply()
                    }
                    navController.navigate(Routes.MainScreen.route)
                },
                Modifier
                    .size(260.dp, 110.dp)
                    .shadow(15.dp, shape = RoundedCornerShape(13))
            ) {
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment  =  Alignment.Start){
                    Text(
                        text = "ENGLISH",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 5.dp , bottom = 15.dp)
                    )
                    Text(
                        text = "Proceed in English",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Light,
                    )
                }
            }
        }
    }
}