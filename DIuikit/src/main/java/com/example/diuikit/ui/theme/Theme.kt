package com.example.diuikit.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = GradientEnd,
    onPrimary = White,
    background = White,
    surface = GradientEnd,
    onBackground = Black,
    onSurface = White

)

private val AppTypography = Typography(
    headlineLarge = Title1ExtraBold,
    headlineMedium = Title1SemiBold,
    titleLarge = Title2SemiBold,
    titleMedium = Title2Regular,
    bodyLarge = TextRegular,
    bodyMedium = TextMedium,
    labelLarge = CaptionRegular,
    labelMedium = CaptionSemiBold
)

@Composable
fun DIuikitTheme(
    content: @Composable () -> Unit
){
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = AppTypography,
        content = content
    )
}
