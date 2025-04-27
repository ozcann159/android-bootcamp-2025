package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //veri ekleme (add): en sonuna ekleme yapar
    meyveler.add("Elma") //0. ındex
    meyveler.add("Muz") //1.
    meyveler.add("Kiraz")
    println(meyveler)

    //Güncelleme (Update)
    meyveler[1] = "Armut" //Kacıncın indexi düzenlemek istiyorsak [] içine o index numarası yazılır.
    println(meyveler)

    //Insert: istediğimiz bir indekse ekleme yapar
    meyveler.add(1,"portakal")
    println(meyveler)

    //Okuma(veri alma)
    println(meyveler.get(3))
    println(meyveler[3])

    //removeAt() : istediğimiz index numarasını yazarak o indeksi silmemizi sağlar.
    //clear : içeriğini tamamen siler.

}