package com.example.weatherapp.utils

import android.util.Log
import java.text.SimpleDateFormat
import java.util.Locale



fun formatTime(dateTime: String): String {

    val inputFormat = SimpleDateFormat(
        "yyyy-MM-dd HH:mm:ss",
        Locale.getDefault()
    )

    val outputFormat = SimpleDateFormat(
        "hh a",
        Locale.getDefault()
    )

    val date = inputFormat.parse(dateTime)
    Log.d("date", "$date")
    return outputFormat.format(date!!)

}