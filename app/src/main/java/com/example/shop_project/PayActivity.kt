package com.example.shop_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shop_project.ui.theme.Shop_ProjectTheme

class PayActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
MyPay()
        }
    }
}

@Composable
fun MyPay(){
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
//    verticalArrangement = Arrangement.Center
    ) {


        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "woman3",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Pay By Cart",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = " Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation",
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 30.dp, end = 30.dp)
        )

//    Row(modifier = Modifier.fillMaxWidth()) {
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            drawCircle(
//                color = Color.Black,
//                center = size.Offset(),
//
//
//            )
//        }
//
//    }
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            },
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(Color(234,131,133)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyPayPreview() {
    MyPay()
}