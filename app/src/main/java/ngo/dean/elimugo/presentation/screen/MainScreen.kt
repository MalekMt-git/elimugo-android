package ngo.dean.elimugo.presentation.screen

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
import ngo.dean.elimugo.util.ShareAPK
import org.monora.uprotocol.client.android.activity.HomeActivity

@Composable
fun MainScreen(navController: NavController, context: Context) {
    Toolbar()
    MainScreenContent(navController = navController , context)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreenContent(
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
    }
}