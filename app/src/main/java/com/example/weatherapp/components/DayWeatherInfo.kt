package com.example.weatherapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.data.WeatherInfo

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DayWeatherInfo() {

    LazyColumn(
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        items(WeatherInfo.info) { weatherInfo ->
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                item {
                    Icon(
                        painter = painterResource(weatherInfo.icon),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = weatherInfo.text)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = weatherInfo.info)
                }
            }

            HorizontalDivider(
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }


}