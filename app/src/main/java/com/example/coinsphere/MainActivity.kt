package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
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
fun HomeScreen() {
    val Background = Color(0xFF0B1020)
    val Surface = Color(0xFF151B2E)
    val TextMain = Color(0xFFE8ECF8)
    val TextDim = Color(0xFF9AA3B2)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(start = 16.dp, end = 16.dp, top = 40.dp, bottom = 16.dp)
    ) {
        Text(
            text = "CoinSphere",
            color = TextMain
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Surface)
        ) {
            Text(
                text = "Global Market Cap",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                color = TextDim
            )
            Text(
                text = "$2.18T",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp),
                color = TextMain
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Surface)
        ) {
            Text(
                text = "Fear & Greed",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                color = TextDim
            )
            Text(
                text = "Neutral (54)",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp),
                color = TextMain
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Surface)
        ) {
            Text(
                text = "Altcoin Season",
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                color = TextDim
            )
            Text(
                text = "No",
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 10.dp),
                color = TextMain
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
                    .weight(1f),
                color = TextDim
            )
            Text(
                text = "Name",
                modifier = Modifier
                    .weight(5f),
                color = TextDim
            )
            Text(
                text = "Price",
                modifier = Modifier
                    .weight(4f),
                color = TextDim
            )
        }
        // Listado
        Column() {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(coinList) { coin ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        colors = CardDefaults.cardColors(Surface)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 6.dp, bottom = 6.dp, start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "${coin.number}",
                                modifier = Modifier
                                    .weight(1f),
                                color = TextDim
                            )
                            Box(
                                modifier = Modifier
                                    .size(28.dp)
                                    .weight(1f)
                                    .clip(CircleShape)
                            ) {
                                AsyncImage(
                                    model = ImageRequest.Builder(LocalContext.current)
                                        .data(coin.image)
                                        .crossfade(true)
                                        .build(),
                                    contentDescription = coin.name,
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Text(
                                text = coin.name,
                                modifier = Modifier
                                    .weight(6f)
                                    .padding(start = 7.dp),
                                color = TextMain
                            )
                            Text(
                                text = coin.price,
                                modifier = Modifier
                                    .weight(6f),
                                color = TextMain
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