package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //1.soru
    var s1 = Odev2()
    var cozum = s1.fahrenhietDonustur(20)
    println("Fahrenheit : $cozum") // 6.0

    // 2. soru
   s1.dikdörtgenCevresi(5,4)

    // 3.Soru
    s1.faktoriyelHesaplama(4)

    // 4. Soru
    s1.harfbulucu("adana")

    //5. soru
    s1.icAcilarToplami(5)

    //6.Soru
    var soru6 = s1.maasHesapla(30)
    println("Maaş: $soru6")

    //7.Soru
    var soru7 = s1.kotaHesap(40)
    println("Ucret: $soru7")
}