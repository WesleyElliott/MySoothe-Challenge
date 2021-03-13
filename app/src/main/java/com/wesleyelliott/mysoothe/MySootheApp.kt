package com.wesleyelliott.mysoothe

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

@SuppressLint("NewApi")
@Composable
fun EdgeToEdge(
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    val window = (LocalContext.current as Activity).window
    window.statusBarColor = android.graphics.Color.valueOf(0f, 0f, 0f, 0f).toArgb()
    val insetsController = remember(view, window) {
        WindowCompat.getInsetsController(window, view)
    }
    val isLightTheme = MaterialTheme.colors.isLight
    insetsController?.run {
        isAppearanceLightStatusBars = isLightTheme
    }
    ProvideWindowInsets {
        content()
    }
}

@Composable
fun MySootheApp() {
    EdgeToEdge {
        Surface(color = MaterialTheme.colors.background) {
            NavGraph()
        }
    }
}