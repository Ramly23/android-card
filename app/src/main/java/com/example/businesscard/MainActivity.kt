package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContainer()
                }
            }
        }
    }
}

@Composable
fun MainContainer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFd4ecd4))
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .align(alignment = Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                val image = painterResource(R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .background(Color(0xFF053444), shape = RoundedCornerShape(16.dp))
                        .width(100.dp)
                        .height(100.dp)
                        .padding(8.dp)
                )
                Text(
                    text = stringResource(R.string.name),
                    fontSize = 36.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 8.dp)
                )
                Text(
                    text = stringResource(R.string.description),
                    color = Color(0xFF207f60)
                )
            }
            // Second Part
            Column(
                modifier = Modifier
                    .offset(
                        y = 150.dp
                    )
                    .padding(8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            ) {
                Row {
                    Icon(
                        Icons.Default.Phone,
                        contentDescription = null,
                        tint = Color(0xFF207f60)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = stringResource(R.string.phone_number),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        color = Color(0xFF4d5b50)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Icon(
                        Icons.Default.Share,
                        contentDescription = null,
                        tint = Color(0xFF207f60),
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = stringResource(R.string.share_text),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        color = Color(0xFF4d5b50)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = null,
                        tint = Color(0xFF207f60)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = stringResource(R.string.email),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        color = Color(0xFF4d5b50)
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        MainContainer()
    }
}