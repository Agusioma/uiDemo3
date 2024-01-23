package com.tcreatesllc.uidemo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                    cardBoxComponent2()
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
fun titleAndSubTitle(title: String, subTitle: String){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            color = Color.LightGray,
            fontFamily = demoFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = subTitle,
            color = Color.Gray,
            fontFamily = demoFontFamily,
            fontWeight = FontWeight.Light,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

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
fun cardBoxComponent1() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(bottom = 20.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(30.dp)

        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .height(120.dp)
                    .padding(top = 0.dp)
            ) {

                customChipComponent(
                    rotationAngle = 5f,
                    bgColor = 0xFF262835,
                    cornerRadius = 25.dp,
                    iconResInt = R.drawable.netflix_1_logo_svgrepo_com,
                    amount = "10$",
                    label = "Netflix",
                    opacity = 0.1f,
                    mods = Modifier.align(Alignment.BottomCenter)
                )
                customChipComponent(
                    rotationAngle = -2f,
                    bgColor = 0xFF262835,
                    cornerRadius = 25.dp,
                    iconResInt = R.drawable.spotify_color_svgrepo_com,
                    amount = "10$",
                    label = "Spotify",
                    opacity = 0.3f,
                    mods = Modifier.align(Alignment.TopCenter)
                )

            }

            customChipComponent(
                rotationAngle = -5f,
                bgColor = 0xFF262835,
                cornerRadius = 25.dp,
                iconResInt = R.drawable.amazon_color_svgrepo_com,
                amount = "243$",
                label = "Amazon",
                opacity = 0.3f,
                mods = Modifier.align(Alignment.TopCenter)
            )


            cardComponent(
                rotationAngle = -5f,
                bgColor = 0xFF262835,
                25.dp,
                mods = Modifier.align(Alignment.TopCenter)
            )

        }

    }
}


@Composable
fun cardBoxComponent2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 50.dp, bottom = 50.dp, end = 50.dp)
                .height(140.dp)

        ) {

            customChipComponentv2(
                rotationAngle = -10f,
                bgColor = 0xFF262835,
                cornerRadius = 25.dp,
                iconResInt = R.drawable.netflix_1_logo_svgrepo_com,
                amount = "43$",
                label = "Netflix",
                opacity = 0.1f,
                mods = Modifier
                    .align(Alignment.Center)
                    .padding(start = 50.dp, top = 70.dp)
            )

            customChipComponentv2(
                rotationAngle = -10f,
                bgColor = 0xFF262835,
                cornerRadius = 25.dp,
                iconResInt = R.drawable.amazon_color_svgrepo_com,
                amount = "75$",
                label = "Amazon",
                opacity = 0.5f,
                mods = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 45.dp)
            )

            customChipComponentv2(
                rotationAngle = 10f,
                bgColor = 0xFF262835,
                cornerRadius = 25.dp,
                iconResInt = R.drawable.spotify_color_svgrepo_com,
                amount = "24$",
                label = "Spotify",
                opacity = 0.9f,
                mods = Modifier
                    .align(Alignment.TopCenter)
                    .padding(end = 30.dp, bottom = 30.dp)
            )

        }
    }
}

@Composable
fun cardComponent(rotationAngle: Float, bgColor: Long, cornerRadius: Dp, mods: Modifier) {
    Box(
        modifier = mods
            .fillMaxWidth()
            .height(240.dp)
            .padding(start = 5.dp, end = 5.dp, top = 35.dp, bottom = 10.dp)
            .rotate(rotationAngle)
            .alpha(0.9f)

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
fun customChipComponentv2(
    rotationAngle: Float,
    bgColor: Long,
    cornerRadius: Dp,
    iconResInt: Int,
    label: String,
    amount: String,
    opacity: Float,
    mods: Modifier
) {
    Box(
        modifier = mods
            .width(200.dp)
            .height(70.dp)
            .padding(start = 0.dp, end = 0.dp)
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

@Composable
fun customChipComponent(
    rotationAngle: Float,
    bgColor: Long,
    cornerRadius: Dp,
    iconResInt: Int,
    label: String,
    amount: String,
    opacity: Float,
    mods: Modifier
) {
    Box(
        modifier = mods
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

@Composable
fun circle(pos: Int) {
    Canvas(modifier = Modifier.size(20.dp)) {
        if (pos == 0) {

            drawCircle(
                color = Color.White,
                radius = 10f,
                center = Offset(size.width / 2, size.height / 2)
            )
        } else {
            drawCircle(
                color = Color.Gray,
                radius = 10f,
                center = Offset(size.width / 2, size.height / 2)
            )
        }

    }

}

@Composable
fun circleRow() {
    Row {
        for (i in 0..2) {
            circle(i)
        }

    }
}

@Composable
fun screenOne(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        titleAndSubTitle(title = "Manage your regular expenses", subTitle = "Enter the existing subscriptions and have an easy overview")

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
            bgColor = 0xFF262835,
            25.dp
        )*/

        /* customChipComponent(
             rotationAngle = 0f,
             bgColor = 0xFF262835,
             cornerRadius = 25.dp,
             iconResInt = R.drawable.spotify_color_svgrepo_com,
             amount = "10$",
             label = "Spotify",
             opacity = 1f
         )*/
        //cardBoxComponent1()
        //cardBoxComponent2()
        //circleRow()
        titleAndSubTitle(title = "Manage your regular expenses", subTitle = "Enter the existing subscriptions and have an easy overview")
    }
}