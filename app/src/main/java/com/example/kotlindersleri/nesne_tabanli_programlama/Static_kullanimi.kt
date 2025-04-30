package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ClassA() //ClassA sanal bir nesne. a ismi ile kullanabilirsin

    //Standart nesne tabanlı erişim
    //println(a.x)
    //a.metod()

    //Sanal nesne - Virtual Object - Nameless(İsimsiz) Object
    //println(ClassA().x) // 1. Nesne
    //ClassA().metod() // 2. Nesne

    //Static kullanımı -parantez yok
    println(ClassA.x)
    ClassA.metod()
}