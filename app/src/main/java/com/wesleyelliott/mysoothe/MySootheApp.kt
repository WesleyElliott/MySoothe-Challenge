package com.wesleyelliott.mysoothe

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

@Composable
fun MySootheApp() {
    ProvideWindowInsets {
        Surface(color = MaterialTheme.colors.background) {
            NavGraph()
        }
    }
}