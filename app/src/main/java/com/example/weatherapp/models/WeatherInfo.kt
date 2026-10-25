package com.example.weatherapp.models

import androidx.compose.ui.graphics.painter.Painter

data class WeatherInfo(
    val icon: Int,
    val text: String,
    val info: String
)
