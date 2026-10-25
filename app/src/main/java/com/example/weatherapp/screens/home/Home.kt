package com.example.weatherapp.screens.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherapp.components.MainCardWeather
import com.example.weatherapp.models.WeatherViewModel
import androidx.compose.runtime.getValue
import com.example.weatherapp.components.DayCard
import com.example.weatherapp.components.DayWeatherInfo
import com.example.weatherapp.components.SearchBar
import org.jetbrains.annotations.Debug

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WeatherHomeScreen(
    viewModel: WeatherViewModel = viewModel()
) {
    val weather by viewModel.weather.collectAsState()
    Scaffold(
        topBar = {
            SearchBar(
                viewModel = viewModel
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            weather?.let { data ->
                val currentWeather = data.list[0]
                val todayForecast = data.list.take(6)

                val imageUrl =
                    "https://openweathermap.org/img/wn/${currentWeather.weather[0].icon}@2x.png"

                Log.d("image", imageUrl)


                MainCardWeather(
                    city = data.city.name,
                    temp = currentWeather.main.temp,
                    tempDesc = currentWeather.weather[0].main,
                    feelsLike = currentWeather.main.feels_like,
                    time = currentWeather.dt_txt,
                    forecast = todayForecast,
                    image = imageUrl
                )


            } ?: run {
                MainCardWeather(
                    city = "Search City",
                    temp = 0.0,
                    tempDesc = "Clear",
                    feelsLike = 0.0,
                    time = "Now",
                    forecast = emptyList(),
                    image = "https://openweathermap.org/img/wn/01n@2x.png"
                )
            }

            DayCard()
            DayWeatherInfo()
        }


    }

}

