package com.example.feature_module

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun HelloPaparazziScreen() {

    Text(
        text = "Hello paparazzi2222",
        Modifier.background(color = Color.Green)
    )
}