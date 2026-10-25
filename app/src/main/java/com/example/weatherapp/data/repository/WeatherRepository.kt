package com.example.weatherapp.data.repository

import com.example.weatherapp.models.WeatherResponse
import com.example.weatherapp.network.RetrofitInstance

class WeatherRepository {

    suspend fun getWeather(city:String): WeatherResponse{
        return RetrofitInstance.api.getWeather(
            city = city,
            apiKey = "83ebaa3e52510c1fe7228ef7018f6a0e"
        )

    }

}