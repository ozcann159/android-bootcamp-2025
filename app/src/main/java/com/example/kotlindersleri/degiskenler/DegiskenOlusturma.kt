package com.example.kotlindersleri.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("Id :$id")
    println("Ad: ad")
    println("Resim: $resim")
    println("Puan: $puan")
    println("Fiyat: $fiyat")
    println("Stok durum: $stokDurum")


    //Sabitler - Constant

    var sayi =30
    sayi = 100
    println(sayi)

    val numara = 50
    println(numara)

    // Tür Dönüsümü - Type Casting

    //1- Sayısaldan sayısala dönüsüm
    val d = 89.96
    val i = 30
    val sonuc2 = i.toDouble()
    val sonuc1 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //2-  Sayisaldan metine dönüsüm
    var x = 85
    var sonuc3 = x.toString()
    println(sonuc3)

    // Metinden sayisala dönüsüm
    val yazi = "48t"
    val sonuc4 = yazi.toIntOrNull()


    if (sonuc4 != null){
        println(sonuc4)
    }else{
        println("Sonuc nulldur")
    }

}