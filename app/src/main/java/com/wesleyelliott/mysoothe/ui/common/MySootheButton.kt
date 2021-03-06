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

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MySootheButton(
    modifier: Modifier = Modifier,
    text: String,
    buttonColors: ButtonColors = buttonColors(),
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        colors = buttonColors,
        onClick = onClick
    ) {
        Text(
            text = text.toUpperCase(),
        )
    }
}

@Composable
fun MySootheSecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    val buttonColors = buttonColors(
        backgroundColor = MaterialTheme.colors.secondary
    )
    MySootheButton(
        modifier = modifier,
        text = text,
        buttonColors = buttonColors,
        onClick = onClick
    )
}

@Preview
@Composable
fun PreviewMySootheButton() {
    MySootheButton(
        text = "Test",
        onClick = {
        }
    )
}

@Preview
@Composable
fun PreviewMySootheSecondaryButton() {
    MySootheSecondaryButton(
        text = "Test",
        onClick = {
        }
    )
}
