package com.example.diuikit.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = GradientEnd, //Главный цвет
    onPrimary = White, //Цвет, лежащий поврех primary (текст, иконки)
    background = White, //Фон всего экрана
    surface = GradientEnd, //Поверхность (карточки, диологовые окна и тп.)
    onBackground = Black, //Цвет текста поверх белого фона экрана
    onSurface = White //Цвет текста поверх карточек

)

private val AppTypography = Typography(
    headlineLarge = Title1ExtraBold, //Самые крупные заголовки
    headlineMedium = Caption2Bold, //Заголовки чуть поменьше
    titleLarge = Title2SemiBold, //Заголовки карточек
    titleMedium = HeadlineRegular, //Подзаголовки
    bodyLarge = TextRegular, //Основной текст
    bodyMedium = Caption2Regular, //Текст чуть меньше
    labelLarge = CaptionRegular, //Текст на кнопках или вкладках
    labelMedium = CaptionSemiBold //Мелкий текст
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
