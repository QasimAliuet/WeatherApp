package com.example.weatherapp.models

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.repository.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import android.util.Log.e

class WeatherViewModel : ViewModel() {
    private val repository = WeatherRepository()

    private val _city = MutableStateFlow<String>("")
    val city: StateFlow<String> = _city.asStateFlow()

    private val _weather = MutableStateFlow<WeatherResponse?>(null)
    val weather: StateFlow<WeatherResponse?> = _weather.asStateFlow()

    private val _error: MutableStateFlow<String> = MutableStateFlow("")

    val error: StateFlow<String> = _error.asStateFlow()


    fun updateCity(city: String) {
        _city.value = city
    }

    fun searchCity() {
        Log.d("Search Click", _city.value)
        viewModelScope.launch {
            try {
                val response = repository.getWeather(
                    city = _city.value
                )

                _weather.value = response

            } catch (e: Exception) {
                Log.e("Weather Error", e.toString())
                _error.value = "Something went Wrong"

            }

        }
        Log.d("response", _weather.value.toString())
    }
}