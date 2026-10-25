package com.example.weatherapp.models

data class WeatherItem(

    val dt: Long,

    val main: Main,
    val icon: String,

    val weather: List<Weather>,

    val clouds: Clouds,

    val wind: Wind,

    val visibility: Int,

    val pop: Double,

    val dt_txt: String

)
