package com.wesleyelliott.mysoothe.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wesleyelliott.mysoothe.R
import com.wesleyelliott.mysoothe.ui.common.MySootheButton
import com.wesleyelliott.mysoothe.ui.common.MySootheTextField
import com.wesleyelliott.mysoothe.ui.theme.isDarkTheme

@Composable
fun LoginScreen(
    isDarkTheme: Boolean = isDarkTheme(),
    onLoginClick: () -> Unit
) {

    val backgroundRes: Int = if (isDarkTheme) {
        R.drawable.bg_login_dark
    } else {
        R.drawable.bg_login_light
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
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                modifier = Modifier.padding(top = 200.dp),
                text = "LOGIN",
                style = MaterialTheme.typography.h1
            )

            val state = remember {
                mutableStateOf("")
            }
            MySootheTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp),
                value = state.value,
                placeholder = "Email address",
                onValueChange = { state.value = it },
            )

            MySootheTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                value = "",
                placeholder = "Password",
                onValueChange = { /*TODO*/ },
            )

            MySootheButton(
                modifier = Modifier.padding(top = 8.dp),
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
fun PreviewLoginScreen() {
    LoginScreen(
        isDarkTheme = false
    ) {

    }
}