package com.example.renchityourstartupautoguide.ui.theme

import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable

@Composable
fun renChitFieldColors(): TextFieldColors = OutlinedTextFieldDefaults.colors(
    focusedTextColor = PrimaryText,
    unfocusedTextColor = PrimaryText,
    focusedContainerColor = CardWhite,
    unfocusedContainerColor = CardWhite,
    focusedBorderColor = OxideBronze,
    unfocusedBorderColor = StoneTaupe,
    focusedLabelColor = OxideBronze,
    unfocusedLabelColor = SecondaryText,
    cursorColor = OxideBronze
)