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