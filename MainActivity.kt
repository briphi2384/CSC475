package com.example.myapplication2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication2.ui.theme.MyApplication2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2Theme {
                CenteredGreeting("Hello, AndroidI!")
            }
        }
    }
}

@Composable
fun CenteredGreeting(message: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Adds padding around the screen edges
        contentAlignment = Alignment.Center // Centers the content within the Box
    ) {
        Text(text = message)
    }
}
