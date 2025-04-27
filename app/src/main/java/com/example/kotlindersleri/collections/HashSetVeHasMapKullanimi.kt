package com.example.kotlindersleri.collections

fun main() {
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String>()
    //Any -> En üst sınıf demektir.
    //Bütün türleri kapsar.


    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler) //Eklediğimiz sırayla eklenmedi.(hashSet özelliği)


    meyveler.add("Elma")
    println(meyveler) //Aynı veriyi tekrar eklemez.
    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut: ${meyveler.size}")
    println()

    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for ((index, meyve) in meyveler.withIndex()){
        println("$index. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}