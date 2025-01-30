package com.example.cs501_1_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cs501_1_2.ui.theme.CS501_1_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CS501_1_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowText(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
//@Composable is for developing UI
fun Greeting(str: String, modifier: Modifier = Modifier) {
    Text(
        text = "$str",
        textAlign = TextAlign.Center,
        modifier = modifier.fillMaxSize().padding(start = 150.dp, end = 150.dp,top = 150.dp, bottom = 650.dp)
    )
}
@Composable
fun ShowText(modifier: Modifier = Modifier){
    var mess : MutableState<String> = remember { mutableStateOf("") }
    Greeting(mess.value)
    Button(
        onClick = { mess.value = "Hello World"},
        modifier = modifier.fillMaxSize().padding(start = 150.dp,end = 150.dp,top = 400.dp,bottom = 400.dp),
    ) {
        Text(text = "CLICK")

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CS501_1_2Theme {
        Greeting("Android")
    }
}