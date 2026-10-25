package com.example.weatherapp.network

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



object RetrofitInstance {
    private const val BASE_URL: String = "https://api.openweathermap.org/"

    val api: WeatherApiService by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)
    }

}