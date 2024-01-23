package com.tcreatesllc.uidemo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tcreatesllc.uidemo3.ui.theme.UiDemo3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiDemo3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

val demoFontFamily = FontFamily(
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

@Composable
fun roundRect(
    width: Dp,
    height: Dp,
    mods: Modifier,
    bgColor: Long,
    cornerRadius: Dp
) {
    Canvas(
        modifier = mods
            .fillMaxWidth()
            .fillMaxHeight()
        //.alpha(0.7f)
    ) {
        drawRoundRect(
            color = Color(bgColor),
            size = Size(width = size.width, height = size.height),
            cornerRadius = CornerRadius(x = cornerRadius.toPx(), y = 30.dp.toPx())
        )
    }
}

@Composable
fun cardComponent(rotationAngle: Float, bgColor: Long, cornerRadius: Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .padding(30.dp)
            .rotate(rotationAngle)

    ) {
        /*you can make this a shape using the concept detailed here:


         */
        roundRect(
            width = 168.dp,
            height = 168.dp,
            mods = Modifier.align(
                Alignment.Center
            ),
            bgColor = bgColor,
            cornerRadius = cornerRadius
        )

        Icon(
            painter = painterResource(id = R.drawable.visa_svgrepo_com),
            contentDescription = "",
            tint = Color.LightGray,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 15.dp, start = 25.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.wifi_svgrepo_com),
            contentDescription = "",
            tint = Color.LightGray,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(top = 0.dp, end = 25.dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(80.dp)
                .padding(start = 25.dp, bottom = 20.dp)
                .wrapContentWidth()
        ) {
            Text(
                text = "John Clayne",
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )

            Text(
                text = "**** 1425",
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontSize = 14.sp,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = "05/22",
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontSize = 14.sp,
                modifier = Modifier.align(Alignment.BottomEnd)
            )
        }

    }
}

@Composable
fun customChipComponent(
    rotationAngle: Float,
    bgColor: Long,
    cornerRadius: Dp,
    iconResInt: Int,
    label: String,
    amount: String,
    opacity: Float
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(start = 60.dp, end = 60.dp)
            .rotate(rotationAngle)
            .alpha(opacity)

    ) {
        /*you can make this a shape using the concept detailed here:


         */
        roundRect(
            width = 168.dp,
            height = 168.dp,
            mods = Modifier.align(
                Alignment.Center
            ),
            bgColor = bgColor,
            cornerRadius = cornerRadius
        )

        Row(
            modifier = Modifier
                .align(
                    Alignment.TopStart
                )
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                painter = painterResource(id = iconResInt),
                contentDescription = "",
                tint = Color.Unspecified,
            )
            Text(
                text = label,
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = amount,
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp,
                modifier = Modifier.padding(end = 5.dp)
            )
        }

    }
}
/*
@Composable
fun rotationDemoComponent(mods: Modifier, rotationAngle: Float, label: String, bgColor: Long) {
    Box(
        modifier = mods
            //.height(195.dp)
            .padding(top = 5.dp, bottom = 5.dp)

    ) {
        roundRect(
            width = 168.dp,
            height = 168.dp,
            rotationAngle = rotationAngle,
            mods = Modifier.align(
                Alignment.Center
            ),
            bgColor = bgColor
        )
        canvasText(
            mods = Modifier.align(
                Alignment.Center
            ),
            rotationAngle = rotationAngle,
            label = label
        )
    }
}
 */


@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    UiDemo3Theme {
        /*cardComponent(
            rotationAngle = -10f,
            bgColor = 0xFF272936,
            25.dp
        )*/

        customChipComponent(
            rotationAngle = 0f,
            bgColor = 0xFF272936,
            cornerRadius = 25.dp,
            iconResInt = R.drawable.spotify_color_svgrepo_com,
            amount = "10$",
            label = "Spotify",
            opacity = 1f
        )
    }
}