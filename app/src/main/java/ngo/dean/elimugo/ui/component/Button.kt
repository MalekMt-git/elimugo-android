package ngo.dean.elimugo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ngo.dean.elimugo.R
import ngo.dean.elimugo.ui.theme.White
import ngo.dean.elimugo.ui.theme.gradient

@Composable
fun ElimuGoButton(title: String, icon : Painter, description : String, onClick: () -> Unit){

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp , pressedElevation = 0.dp) ,
        modifier = Modifier
            .size(150.dp, 200.dp)
            .padding(horizontal = 5.dp , vertical = 12.dp)
            .shadow(8.dp, shape = RoundedCornerShape(8))
            .background(gradient)
    ) {

        Box(Modifier.fillMaxSize()) {
            Text(
                text = title,
                color = White,
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
                color = White,
                fontSize = 11.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(BottomCenter)
            )
        }
    }}