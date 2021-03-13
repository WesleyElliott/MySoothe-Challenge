package com.wesleyelliott.mysoothe.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
                onClick = { /*TODO*/ }
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