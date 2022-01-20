package ngo.dean.elimugo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ngo.dean.elimugo.R

@Composable
fun ElimuGoButton(title: String, icon : Painter, description : String, onClick: () -> Unit){

    Button(
        onClick = onClick,
        modifier = Modifier
            .size(150.dp, 200.dp)
            .padding(horizontal = 5.dp , vertical = 12.dp)
            .shadow(5.dp, shape = RoundedCornerShape(8))
    ) {

        Box(Modifier.fillMaxSize()) {

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.align(TopCenter)
            )

            Image(
                painter = icon,
                contentDescription = stringResource(R.string.content_description),
                modifier = Modifier.align(Center),
            )

            Text(
                text = description,
                fontSize = 11.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(BottomCenter)
            )
        }
    }}