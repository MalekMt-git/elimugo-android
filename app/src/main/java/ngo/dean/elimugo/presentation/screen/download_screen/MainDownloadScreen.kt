package ngo.dean.elimugo.presentation.screen.download_screen


import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import ngo.dean.elimugo.R
import ngo.dean.elimugo.presentation.component.ElimuGoButton
import ngo.dean.elimugo.presentation.component.GuideLine
import ngo.dean.elimugo.presentation.component.Toolbar
import ngo.dean.elimugo.presentation.nav.controller.Routes
import ngo.dean.elimugo.presentation.theme.gradient_blue
import ngo.dean.elimugo.presentation.theme.gradient_green
import org.monora.uprotocol.client.android.activity.ContentBrowserActivity
import org.monora.uprotocol.client.android.activity.SharingActivity

@Composable
fun MainDownloadScreen(navController: NavController, context: Context) {
    Toolbar()
    MainDownloadScreenContent(navController = navController , context)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainDownloadScreenContent(
    navController: NavController , context: Context
) {
    GuideLine(text = stringResource(R.string.main_screen_toolbar_title)) {
        Toast.makeText(context , R.string.will_be_soon , Toast.LENGTH_LONG).show()
    }

    Box(
        modifier=Modifier.fillMaxSize()
    ) {

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier
                .align(Center)
                .padding(horizontal = 10.dp)
                .padding(top = 40.dp)
        ) {
            item {
                ElimuGoButton(
                    topIcon = painterResource(id = R.drawable.elimugo_download_device_icon)
                    , icon = painterResource(id = R.drawable.mobile_download_device_icon),
                    description = stringResource(R.string.connect_to_another_elimugp_app)){
                    startActivity(context,Intent(context, ContentBrowserActivity::class.java) ,null)}
            }
            item {
                ElimuGoButton(
                    topIcon = painterResource(id = R.drawable.elimuonline_name_icon)
                    , icon = painterResource(id = R.drawable.elimuonline_main_icon),
                    buttonBackgroundColor = gradient_blue,
                    description = stringResource(R.string.online_connection)){
                    navController.navigate(Routes.DownloadFromServerScreen.route)
                }
            }
            item {
                ElimuGoButton(
                    topIcon = painterResource(id = R.drawable.elimupi_logo)
                    , icon = painterResource(id = R.drawable.elimupi_download_icon),
                    buttonBackgroundColor = gradient_green,
                    description = stringResource(R.string.connect_local_elimupi)){
                    navController.navigate(Routes.DownloadFromServerScreen.route)
                }
            }
        }
    }
}