package com.example.weatherapp.data

import com.example.weatherapp.models.WeatherData as WeatherDataModel

object WeatherData {
    val data = listOf(
        WeatherDataModel(time = "Now", temp = "25°"),
        WeatherDataModel(time = "Now", temp = "19°"),
        WeatherDataModel(time = "Now", temp = "21°"),
        WeatherDataModel(time = "Now", temp = "28°"),
        WeatherDataModel(time = "Now", temp = "17°")
    )
}