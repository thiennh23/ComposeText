package com.example.composetext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.composetext.ui.theme.ComposeTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTextTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black), contentAlignment = Alignment.Center) {

                    val annotatedString = buildAnnotatedString {
                        blueGradientText("NEW")
                        append("\n\n")
                        pink_blueGradientText("Gradient")
                        append("\n\n")
                        blueGradientText("Text")

                    }
                    
                    Text(text = annotatedString)


                    /*Text(
                        text = stringResource(id = R.string.hello)
                            .plus(" ")
                            .repeat(30),
                        maxLines = 3,
                        fontSize = 30.sp,
                        color = Color.Red,
                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Center,
                        //Ellipsis: ...
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.fillMaxWidth()
                    )*/


                    /*Text(text = "Nguyen Huu Thien",
                       color = Color.Red,
                       fontSize = 24.sp,
                       textDecoration = TextDecoration.Underline,
                       textAlign = TextAlign.Center,
                       modifier = Modifier.fillMaxWidth())*/


                }
            }
        }
    }

    private fun AnnotatedString.Builder.blueGradientText(s: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2788C7),
                        Color(0xFF00BBD4)

                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(s)
        }
    }

    private fun AnnotatedString.Builder.pink_blueGradientText(s: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3B85),
                        Color(0xFF00BBD4)

                    )
                ), fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(s)
        }
    }
}
