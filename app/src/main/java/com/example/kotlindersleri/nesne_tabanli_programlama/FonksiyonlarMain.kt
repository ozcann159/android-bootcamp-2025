package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2() //String içindeki değer gelenSonuc değişkenine transfer edildi
    println("Gelen Sonuç: $gelenSonuc")

    // parametre
    f.selamla3("Elif")

    // Overloading
    f.topla(10,20,"Beyza")

    f.myFunction()
}