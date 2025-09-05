package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.coinsphere.ui.theme.CoinSphereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
     Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "CoinSphere"
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Gray)
        ) {
            Text(
                text = "Global Market Cap",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
            )
            Text(
                text = "$2.18T",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Gray)
        ) {
            Text(
                text = "Fear & Greed",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
            )
            Text(
                text = "Neutral (54)",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Gray)
        ) {
            Text(
                text = "Altcoin Season",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
            )
            Text(
                text = "No",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp)
            )
        }
        // Seccion de lista
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Text(
                text = "#",
                modifier = Modifier
                    .weight(1f)
            )
            Text(
                text = "Name",
                modifier = Modifier
                    .weight(5f)
            )
            Text(
                text = "Price",
                modifier = Modifier
                    .weight(4f)
            )
        }
        // Listado
        Column() {
            LazyColumn (
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(coinList) { coin ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 6.dp, bottom = 6.dp, start = 5.dp)
                        ) {
                            Text(
                                text = "${coin.number}",
                                modifier = Modifier
                                    .weight(1f)
                            )
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape)
                            ){
                                AsyncImage(
                                    model = coin.image,
                                    contentDescription = coin.name,
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }

                            Text(
                                text = coin.name,
                                modifier = Modifier
                                    .weight(2f)
                            )
                            Text(
                                text = coin.price,
                                modifier = Modifier
                                    .weight(2f)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoinSphereTheme {
        HomeScreen()
    }
}