package com.dheeraj.fancycomposedialog

import FancyAlertDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dheeraj.fancycomposedialog.ui.theme.FancyComposeDialogTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.DialogProperties


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FancyComposeDialogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // Inside your Composable function
    Column() {
        var showDialog by remember { mutableStateOf(false) }

        Button(
            onClick = { showDialog = true }
        ) {
            Text("Show Dialog")
        }

        if (showDialog) {

            FancyAlertDialog(
                title = "Rate us if you like the app",
                backgroundColor = Color(0xFF303F9F),
                message = "Do you really want to Exit ?",
                negativeBtnText = "Cancel",
                positiveBtnBackground = Color(0xFFFF4081),
                positiveBtnText = "Rate",
                negativeBtnBackground = Color(0xFFA9A7A8),
                onPositiveClicked = {
                    // Positive button clicked action
                    // Add your logic here
                    println("Rate")
                    showDialog = false // Dismiss the dialog
                },
                onNegativeClicked = {
                    // Negative button clicked action
                    // Add your logic here
                    println("Cancel")
                    showDialog = false // Dismiss the dialog
                }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FancyComposeDialogTheme {
        Greeting("Android")
    }
}