package com.example.renchityourstartupautoguide.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

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

    outline = StoneTaupe
)

private val DarkColorScheme = darkColorScheme(
    primary = SandGold,
    onPrimary = DeepCharcoal,

    secondary = TrailSage,
    onSecondary = LightText,

    tertiary = OxideBronze,
    onTertiary = LightText,

    background = DeepCharcoal,
    onBackground = WarmIvory,

    surface = Color(0xFF36342F),
    onSurface = WarmIvory,

    surfaceVariant = Color(0xFF454139),
    onSurfaceVariant = WarmIvory,

    outline = StoneTaupe
)

@Composable
fun RenChitYourStartUpAutoGuideTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> LightColorScheme
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
