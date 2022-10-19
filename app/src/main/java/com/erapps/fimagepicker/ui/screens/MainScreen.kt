package com.erapps.fimagepicker.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.erapps.fimagepicker.ui.theme.FimagePickerTheme

@Composable
fun MainScreen() {
    FimagePickerTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

        }
    }
}