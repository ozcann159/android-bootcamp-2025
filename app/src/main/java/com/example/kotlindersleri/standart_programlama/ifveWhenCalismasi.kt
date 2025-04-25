package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17  // sabit degisken

    if (yas >= 18) {  //yas resit mi? degil mi?. True
        println("Reşitsiniz")
    }else{ //false
        println("Reşit değilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 8

    if (ka == "admin" && s==123456) { // && = And(Ve), true && true ise true olur, diğer durumlarda false olur.
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

    if (sayi == 9 || sayi == 10){ //  || = Or(Veya), false && false ise false olur, diğer durumlarda true olur.
    println("sayi 9 veya 10'dur")
    }else{
    println("sayi 9 veya 10 değildir")
    }

    // When, Diğer dillerde Switch
    val number = 1

    when(number){
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        3 -> println("Sayı 3'dür")
        else -> println("Tanımlanmayan sayı")
    }

}