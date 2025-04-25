package com.example.kotlindersleri.standart_programlama

fun main() {
    // 1,2,3
    for (i in 1..3){ // Swift dilinde 1...3 kullanılır. i = index(Dizilerdeki indeks numarası)
        println("Döngü 1: $i")
    }

    // 10 ile 20 arasında 5'er 5'er artmasını istiyoruz
    //i yerine başka harfde kullanılabilir.
    //step 5 anlamındadır.

    for (x in 10..20 step 5){
        println("Döngü 2: $x")
    }
    //
    // 20 ile 10 arasında 5 er azalsın
    //downTo geriye sayımı belirtir.
    for (x in 20 downTo 10 step 5){
        println("Döngü 3: $x")
    }

    // 1,2,3
    var sayac = 1

    while (sayac < 4){
        println("Döngü 4: $sayac")
        sayac+=1 //sayac = sayac +1
    }


    // 1,2,3,4,5
    for (i in 1..5){
        if (i == 3){
            break //döngüyü durdurur.
        }
        println("Döngü 5: $i")
    }

    for (i in 1..5){
        if (i == 3){
            continue //bulunduğu adımı pas geçer.
        }
        println("Döngü 6: $i")
    }

}