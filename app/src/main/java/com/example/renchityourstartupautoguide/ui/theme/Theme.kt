package com.example.renchityourstartupautoguide.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = OxideBronze,
    onPrimary = LightText,

    secondary = TrailSage,
    onSecondary = LightText,

    tertiary = SandGold,
    onTertiary = DeepCharcoal,

    background = WarmIvory,
    onBackground = PrimaryText,

    surface = CardWhite,
    onSurface = PrimaryText,

    surfaceVariant = DividerTaupe,
    onSurfaceVariant = DeepCharcoal,

    // These stop Material from filling the gaps with its default purple-gray
    // tints (dropdown menus, dialogs, the bottom bar's selected pill)
    surfaceContainer = CardWhite,
    surfaceContainerHigh = CardWhite,
    surfaceContainerLow = WarmIvory,
    secondaryContainer = DividerTaupe,
    onSecondaryContainer = DeepCharcoal,
    primaryContainer = DividerTaupe,
    onPrimaryContainer = DeepCharcoal,
    error = androidx.compose.ui.graphics.Color(0xFFA8483C),
    onError = LightText,

    outline = StoneTaupe
)

@Composable
fun RenChitYourStartUpAutoGuideTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}