package com.example.kotlindersleri.collections

fun main() {
    //HashMap JSON veri modeline benzemektedir.
    //Map, Dictionary(Swift)
    //Shared Preferences, DataStore, UserDefault(Swift) = veri kaydetme yapıları

    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa") //1. gösterim
    iller[57] = "Sinop" //2. gösterim
    iller[6] ="Ankara"
    println(iller)

    //güncelleme
    iller[16] = "Yeni Bursa"
    println(iller)

    //Veri Alma
    val il = iller[6]
    println(il)

    // Boyut ögrenme
    println("Boyut: ${iller.size}")

    //Döngü yapısında veri alma
    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    //Silme
    iller.remove(57)
    println(iller)

    iller.clear()
    println(iller)

}