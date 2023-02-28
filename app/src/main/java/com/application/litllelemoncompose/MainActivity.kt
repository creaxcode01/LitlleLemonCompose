package com.application.litllelemoncompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.application.litllelemoncompose.ui.theme.LitlleLemonComposeTheme

class MainActivity : ComponentActivity() { // Main activity inherits from ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) { // Column Layout

                Text(text = "Little Lemon", fontSize = 32.sp,
                    color = Color(0xFFF4CE14))

                Text(

                    text = stringResource(id = R.string.chicago), fontSize = 32.sp,
                    color = Color(0xFFF4CE14))



                Row() { // Row Layout

                    Button(  // parameters of Button

                        onClick = { /*TODO*/ },
                        border = BorderStroke(1.dp, Color.Red),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)




                    )

                    {// body of button
                        Text(text = stringResource(id = R.string.order))
                    }


                        Image(painter = painterResource(id = R.drawable.button1), contentDescription ="") // fuction only with arguments, no body
                    
                }
                
            }                         // end Column Scope

            

        }



    }
}


 @Composable
fun Greeting(name: String) {
Text(text = "Hello $name!")
}


@Preview(showBackground = true)
@Composable
 fun DefaultPreview() {

 LitlleLemonComposeTheme {
 Greeting("Android")

 }

 }