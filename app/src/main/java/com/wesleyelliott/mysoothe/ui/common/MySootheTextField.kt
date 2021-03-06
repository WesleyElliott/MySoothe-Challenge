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
package com.wesleyelliott.mysoothe.ui.common

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wesleyelliott.mysoothe.ui.theme.isDarkTheme

@Composable
fun MySootheTextField(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit
) {

    val backgroundColor = if (isDarkTheme()) {
        MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.BackgroundOpacity)
    } else {
        MaterialTheme.colors.onSecondary
    }
    TextField(
        modifier = modifier
            .padding(top = 4.dp)
            .height(56.dp),
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder?.let {
            {
                Text(
                    text = it,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface
                )
            }
        },
        leadingIcon = leadingIcon,
        textStyle = MaterialTheme.typography.body1,
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp,
            bottomStart = 0.dp,
            bottomEnd = 0.dp
        ),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = backgroundColor,
            textColor = MaterialTheme.colors.onSurface
        )
    )
}

@Preview
@Composable
fun PreviewMySootheTextField() {
    MySootheTextField(
        value = "", onValueChange = { /*TODO*/ },
        placeholder = "Test placeholder"
    )
}
