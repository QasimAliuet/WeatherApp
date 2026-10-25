package com.example.weatherapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.weatherapp.R
import com.example.weatherapp.models.WeatherItem
import com.example.weatherapp.utils.formatTime

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainCardWeather(
    city: String,
    temp: Double,
    tempDesc: String,
    feelsLike: Double,
    time: String,
    image: String,
    forecast: List<WeatherItem>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {

        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Row {
                Text(text = "Now. $city")
            }
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Text(text = "${temp.toInt()}°", fontSize = 30.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        painter = painterResource(R.drawable.darkmoon),
                        contentDescription = null
                    )
                }
                Column() {
                    Text(text = tempDesc)
                    Text(text = "Feels like ${feelsLike}°")

                }

            }
            Spacer(modifier = Modifier.height(15.dp))


            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {


                items(forecast) { item ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = formatTime(item.dt_txt))
                        Spacer(modifier = Modifier.height(15.dp))
                        AsyncImage(
                            model = image,
                            contentDescription = null

                        )


                        Icon(
                            painter = painterResource(R.drawable.darkmoon),
                            contentDescription = null,
                            modifier = Modifier.size(35.dp),
//                            tint = Color.Blue.copy(alpha = 0.7f)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "${item.main.temp.toInt()}°"
                        )
                    }

                }


            }
        }
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.background),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )

        }

    }

}