package com.example.weatherapp.data.repository

import com.example.weatherapp.models.WeatherResponse
import com.example.weatherapp.network.RetrofitInstance

class WeatherRepository {

    suspend fun getWeather(city:String): WeatherResponse{
        return RetrofitInstance.api.getWeather(
            city = city,
            apiKey = "fsjflks7294fsfafj" // add key here
        )

    }

}