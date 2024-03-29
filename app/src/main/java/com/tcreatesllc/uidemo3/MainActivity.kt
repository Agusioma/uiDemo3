package com.tcreatesllc.uidemo3

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.tcreatesllc.uidemo3.ui.theme.UiDemo3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()

        //Hide the status bars

        WindowCompat.setDecorFitsSystemWindows(window, true)
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else {
            window.insetsController?.apply {
                hide(WindowInsets.Type.systemBars())
                systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }
        setContent {
            UiDemo3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    screenOne()
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
fun screenTwo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 25.dp, bottom = 25.dp, start = 10.dp, end = 10.dp)

    ) {
        Icon(
            painter = painterResource(id = R.drawable.round_chevron_left_24),
            contentDescription = "",
            tint = Color.LightGray,
            modifier = Modifier.align(Alignment.TopStart)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(start = 30.dp, end = 30.dp, top = 100.dp)

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

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(350.dp)
                .padding(start = 33.5.dp, end = 33.5.dp, top = 20.dp)
        ) {
            titleAndSubTitle(
                title = "Link your bank account",
                subTitle = "Enroll your U.S checking account by using your online banking credentials",
                mods = Modifier.align(Alignment.TopCenter)
            )

            Button(onClick = {  },
                modifier = Modifier.align(Alignment.Center)
                    .padding(top = 40.dp, bottom = 40.dp, start = 40.dp, end = 40.dp)
                    .height(50.dp)
                    .width(140.dp),

                shape = RoundedCornerShape(25),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF36C688))) {
                Text(
                    text = "Continue",
                    color = Color.White,
                    fontFamily = demoFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                ) }


            circleRow(mods = Modifier.align(Alignment.BottomCenter))
        }

    }
}


@Composable
fun screenOne() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(25.dp)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.TopCenter)
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)) {
                titleAndSubTitle(
                    title = "Manage your regular expenses",
                    subTitle = "Enter the existing subscriptions and have an easy overview",
                    mods = Modifier.align(Alignment.BottomCenter)
                )
                Icon(
                    painter = painterResource(id = R.drawable.round_chevron_left_24),
                    contentDescription = "",
                    tint = Color.LightGray,
                    modifier = Modifier.align(Alignment.TopStart)
                )
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 50.dp, bottom = 50.dp, end = 50.dp)
                .height(140.dp)
                .align(Alignment.Center)

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
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Text(
                text = "Main subscriptions: Spotify, Netflix, Glove, PUBG, and 4 more >",
                color = Color.Gray,
                fontFamily = demoFontFamily,
                fontWeight = FontWeight.Light,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.TopCenter)
            )

            Text(
                text = "Swipe up to get started",
                color = Color.LightGray,
                fontFamily = demoFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )

            circleRow(mods = Modifier.align(Alignment.BottomCenter))
        }

    }
}


@Composable
fun roundRect(
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
fun circleRow(mods: Modifier) {
    Row(modifier = mods) {
        for (i in 0..2) {
            circle(i)
        }

    }
}

@Composable
fun titleAndSubTitle(title: String, subTitle: String, mods: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = mods
    ) {
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
