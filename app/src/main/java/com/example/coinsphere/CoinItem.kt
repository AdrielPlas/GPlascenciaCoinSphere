package com.example.coinsphere

data class CoinItem(
    val number : Int,
    val image : String,
    val name : String,
    val price : String
)

val coinList = listOf(
    CoinItem(1, "https://thecolor.blog/wp-content/uploads/2021/11/logo-bitcoin-naranja-1024x992.png.webp", "Bitcoin", "$111,500.85"),
    CoinItem(2, "", "Ethereum", "$4,330.51"),
    CoinItem(3, "", "BNB", "$846.09"),
    CoinItem(4, "", "Solana", "$204.05"),
    CoinItem(5, "", "XRP", "$2.81"),
    CoinItem(6, "", "Dogecoin", "$0.2141"),
    CoinItem(7, "", "Cardano", "$0.8189"),
    CoinItem(8, "", "Avalancha", "$24.45"),
    CoinItem(9, "", "Shiba Inu", "$0.00001220"),
    CoinItem(10, "", "Lunares", "$3.78")
)