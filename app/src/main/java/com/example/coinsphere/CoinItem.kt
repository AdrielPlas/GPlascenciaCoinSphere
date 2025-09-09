package com.example.coinsphere

data class CoinItem(
    val number : Int,
    val image : String,
    val name : String,
    val price : String
)

val coinList = listOf(
    CoinItem(1, "https://cryptologos.cc/logos/ethereum-eth-logo.png", "Bitcoin", "$111,500.85"),
    CoinItem(2, "https://cryptologos.cc/logos/ethereum-eth-logo.png", "Ethereum", "$4,330.51"),
    CoinItem(3, "https://cryptologos.cc/logos/bnb-bnb-logo.png", "BNB", "$846.09"),
    CoinItem(4, "https://cryptologos.cc/logos/solana-sol-logo.png", "Solana", "$204.05"),
    CoinItem(5, "https://cryptologos.cc/logos/xrp-xrp-logo.png", "XRP", "$2.81"),
    CoinItem(6, "https://cryptologos.cc/logos/dogecoin-doge-logo.png", "Dogecoin", "$0.2141"),
    CoinItem(7, "https://cryptologos.cc/logos/cardano-ada-logo.png", "Cardano", "$0.8189"),
    CoinItem(8, "https://cryptologos.cc/logos/avalanche-avax-logo.png", "Avalancha", "$24.45"),
    CoinItem(9, "https://cryptologos.cc/logos/shiba-inu-shib-logo.png", "Shiba Inu", "$0.00001220"),
    CoinItem(10, "https://cryptologos.cc/logos/polkadot-new-dot-logo.png", "Lunares", "$3.78")
)