package com.application.litllelemoncompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.application.litllelemoncompose.ui.theme.LitlleLemonComposeTheme

class MainActivity : ComponentActivity() { // Main activity inherits from ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Little Lemon", fontSize=32.sp, color = Color(0xFFF4CE14))

        }

    }
}


// @Composable
// fun Greeting(name: String) {
// Text(text = "Hello $name!")
// }
//
// @Preview(showBackground = true)
// @Composable
// fun DefaultPreview() {
// LitlleLemonComposeTheme {
// Greeting("Android")
// }
// }