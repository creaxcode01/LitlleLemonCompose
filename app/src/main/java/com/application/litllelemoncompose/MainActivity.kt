package com.application.litllelemoncompose


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.application.litllelemoncompose.ui.theme.LitlleLemonComposeTheme

class MainActivity : ComponentActivity() { // Main activity inherits from ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LitlleLemonComposeTheme {
                Greeting("Antoine")
            }
        }



    }
}


 @Composable
fun Greeting(name: String) {

     val cContext = LocalContext.current


     Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start,
         modifier = Modifier
         .fillMaxWidth()
         .background(Color(0xFF495E57))) { // Column Layout


         Text(text = "Little Lemon", fontSize = 32.sp,
             color = Color(0xFFF4CE14),
         modifier = Modifier.padding(start = 20.dp, top = 20.dp)
              )


         Text(

             text = stringResource(id = R.string.chicago), fontSize = 32.sp,
             color = Color.White,
             modifier = Modifier.padding(start = 20.dp)
               )




         Row(
             Modifier
                 .fillMaxSize()
                 .padding(20.dp), horizontalArrangement = Arrangement.Start) {
             // Row Layout

             Text(stringResource(R.string.descriptionone), Modifier.width(200.dp), color = Color.White, fontSize = 21.sp)

             //Image(painter = painterResource(id = R.drawable.foodrestaurant), contentDescription = "", Modifier.height(200.dp).clip(RoundedCornerShape(20.dp)) )




             Button(  // parameters of Button

                 onClick = { Toast.makeText(cContext,"Button !",Toast.LENGTH_LONG).show() },  // event handler, OnClick function of Button Class
                 border = BorderStroke(1.dp, Color.Red),
                 shape = RoundedCornerShape(10.dp),
                 colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14))




             )

             {// body of button
                 Text(text = stringResource(id = R.string.order))
             }


         }

     }                         // end Column Scope
}








@Preview(showBackground = true)
@Composable
 fun DefaultPreview() {

 LitlleLemonComposeTheme {
 Greeting("Android")

 }

 }