package com.example.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("data/2.5/forecast")
    suspend fun getWeather(
        @Query("q")
        city: String,

        @Query(value = "appid")
        apiKey: String,

        @Query(value = "units")
        units: String = "metrics",

        ): WeatherResponse
}