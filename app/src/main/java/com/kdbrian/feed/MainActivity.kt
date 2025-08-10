package com.kdbrian.feed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kdbrian.feed.presentation.ui.theme.MenuFeedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .safeContentPadding()
            ) {
                App {

                }
            }


        }
    }
}


@Composable
fun App(content: @Composable () -> Unit = {}) {

    MenuFeedTheme {
        content()
    }

}