package com.example.weatherapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R
import com.example.weatherapp.data.DayData


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DayCard(
) {
    LazyRow(
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(DayData.day){item ->
            Card() {
                Spacer(modifier = Modifier.width(5.dp))
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = item.day)
                    Icon(
                        painter = painterResource(com.example.weatherapp.R.drawable.darkmoon),
                        contentDescription = null,
                    )
                    item.info?.let {
                        Text(text = it)
                    }

                }
            }


        }

    }


}