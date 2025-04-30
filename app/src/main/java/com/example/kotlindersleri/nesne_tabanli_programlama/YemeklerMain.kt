package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne Oluşturma
    val y1 = Yemekler(100,"Köfte",249)
    //Değer Okuma
    y1.bilgiAl()
    /*println("------------")
    println("Id: ${y1.id}")
    println("Ad: ${y1.ad}")
    println("Ad: ${y1.fiyat}")*/


    //Değer atama/değiştirmek
    y1.fiyat = 350

    val y2 = Yemekler(200,"Baklava",300)
    y2.bilgiAl()
    println("------------")
    println("Id: ${y2.id}")
    println("Ad: ${y2.ad}")
    println("Ad: ${y2.fiyat}")
    y2.ad = "Soğuk Baklava"
    println("--------------")
    println("Id: ${y2.id}")
    println("Ad: ${y2.ad}")
    println("Ad: ${y2.fiyat}")



}