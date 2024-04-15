package com.example.stradat_1504.ui.bottom_navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.stradat_1504.R


@Composable
fun Screen1() {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.delete_contact),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Image(
                painter = painterResource(R.drawable.add_contact),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )
        }
    }
}

@Composable
fun Screen2() {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.photoprofile),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = "Belousov",
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "Oleg")

                Spacer(modifier = Modifier.height(30.dp))

            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Mom")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "MTC")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button( modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Vitaliy Andreevich")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}