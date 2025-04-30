package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() //Burda kalıtım  yok kendi sınıfına erişti.
    memeli.sesCikar() // kalıtım var, bir üst sınıfın metoduna erişti
    kedi.sesCikar() // Kalıtım var, kendi metoduna erişti.
    kopek.sesCikar() // Kalıtım var, kendi metoduna erişti.
}