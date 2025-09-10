package com.example.coinsphere

data class CoinItem(
    val number : Int,
    val image : String,
    val name : String,
    val price : String
)

val coinList = listOf(
    CoinItem(1, "https://s2.coinmarketcap.com/static/img/coins/64x64/1.png", "Bitcoin", "$111,500.85"),
    CoinItem(2, "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png", "Ethereum", "$4,330.51"),
    CoinItem(3, "https://s2.coinmarketcap.com/static/img/coins/64x64/1839.png", "BNB", "$846.09"),
    CoinItem(4, "https://s2.coinmarketcap.com/static/img/coins/64x64/5426.png", "Solana", "$204.05"),
    CoinItem(5, "https://s2.coinmarketcap.com/static/img/coins/64x64/52.png", "XRP", "$2.81"),
    CoinItem(6, "https://s2.coinmarketcap.com/static/img/coins/64x64/74.png", "Dogecoin", "$0.2141"),
    CoinItem(7, "https://s2.coinmarketcap.com/static/img/coins/64x64/2010.png", "Cardano", "$0.8189"),
    CoinItem(8, "https://s2.coinmarketcap.com/static/img/coins/64x64/5805.png", "Avalancha", "$24.45"),
    CoinItem(9, "https://s2.coinmarketcap.com/static/img/coins/64x64/5994.png", "Shiba Inu", "$0.00001220"),
    CoinItem(10, "https://s2.coinmarketcap.com/static/img/coins/64x64/6636.png", "Polkadot", "$3.78")
)