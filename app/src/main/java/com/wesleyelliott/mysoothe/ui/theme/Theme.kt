/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wesleyelliott.mysoothe.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val mySootheLightColors = lightColors(
    primary = gray900,
    secondary = rust600,
    background = taupe100,
    surface = white850,
    onPrimary = white,
    onSecondary = white,
    onBackground = taupe800,
    onSurface = gray800
)

private val mySootheDarkColors = darkColors(
    primary = white,
    secondary = rust300,
    background = gray900,
    surface = white150,
    onPrimary = gray900,
    onSecondary = gray900,
    onBackground = taupe100,
    onSurface = white800
)

@Composable
fun MySootheTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        mySootheDarkColors
    } else {
        mySootheLightColors
    }

    MaterialTheme(
        colors = colors,
        typography = mySootheTypography,
        shapes = shapes,
        content = content
    )
}