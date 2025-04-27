package com.example.kotlindersleri.collections

fun main() {
    val f1 = Filmler(1,"Interstellar",50)
    val f2 = Filmler(2,"Neşeli Hayatlar",30)
    val f3 = Filmler(3,"Babam ve Oğlum",80)

    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for (film in filmlerListesi){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }

    //Sorting - Sıralama
    println("----- Artan Sıralama ------")
    //ASC
    val siralama1 = filmlerListesi.sortedWith(compareBy({ it.fiyat}))
    for (film in siralama1){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }

    println("----- Azalan Sıralama ------")
    //DESC
    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat })
    for (film in siralama2){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }

    println("----- Ada Göre Artan Sıralama ------")
    //DESC
    val siralama3 = filmlerListesi.sortedWith(compareBy { it.ad })
    for (film in siralama3){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }

    //Filtreleme
    println("------- Filtreleme1 ------")
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 && it.fiyat < 60}
    for (film in filtreleme1){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }


    println("------- Filtreleme2 ------")
    val filtreleme2 = filmlerListesi.filter { it.ad.contains("a")}
    for (film in filtreleme2){
        println("${film.id}: ${film.ad} ${film.fiyat} TL")
    }

}