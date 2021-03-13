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
package com.wesleyelliott.mysoothe.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wesleyelliott.mysoothe.R
import com.wesleyelliott.mysoothe.ui.common.MySootheButton
import com.wesleyelliott.mysoothe.ui.common.MySootheSecondaryButton
import com.wesleyelliott.mysoothe.ui.theme.isDarkTheme
import dev.chrisbanes.accompanist.insets.statusBarsPadding

@Composable
fun WelcomeScreen(
    isDarkTheme: Boolean = isDarkTheme(),
    onLoginClick: () -> Unit
) {

    val backgroundRes: Int
    val logoRes: Int

    if (isDarkTheme) {
        backgroundRes = R.drawable.bg_welcome_dark
        logoRes = R.drawable.ic_logo_dark
    } else {
        backgroundRes = R.drawable.bg_welcome_light
        logoRes = R.drawable.ic_logo_light
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = backgroundRes),
            contentScale = ContentScale.FillBounds,
            contentDescription = "Background"
        )

        Column(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = logoRes),
                contentDescription = "Logo"
            )

            MySootheButton(
                modifier = Modifier.padding(top = 32.dp, bottom = 8.dp),
                text = "Sign Up",
                onClick = { /*TODO*/ }
            )

            MySootheSecondaryButton(
                text = "Login",
                onClick = onLoginClick
            )
        }
    }
}

@Preview(
    device = Devices.PIXEL_4
)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen(
        isDarkTheme = false
    ) {
    }
}
