package com.example.weatherapp.data

import com.example.weatherapp.models.WeatherInfo as WeatherInfoModel

object WeatherInfo {
    val info = listOf(
        WeatherInfoModel(
            icon = com.example.weatherapp.R.drawable.rainy,
            text = "Perception",
            info = "0%"
        ),
        WeatherInfoModel(
            icon = com.example.weatherapp.R.drawable.wind,
            text = "Wind",
            info = "34km/h"
        ),
        WeatherInfoModel(
            icon = com.example.weatherapp.R.drawable.drop,
            text = "Humidity",
            info = "34%"
        )
    )
}