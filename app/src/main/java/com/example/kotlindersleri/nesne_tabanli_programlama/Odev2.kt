package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    // 1.Soru
    fun fahrenhietDonustur(derece : Int):Double {

        var sonuc = (derece * 1.8) + 32
        return sonuc
    }

    // 2. Soru
    fun dikdörtgenCevresi(uzunKenar:Int,kisaKenar:Int){
       var cevreSonuc = (uzunKenar * kisaKenar)*2
        println("Dikdörtgenin Çevresi: $cevreSonuc")

    }

    // 3. Soru
    fun faktoriyelHesaplama(sayi:Int): Int {
        var sonuc2 = 1
        for(i in 1..sayi){
            sonuc2 *= i
        }
        println("Faktoriyel sonucu: $sonuc2")
        return sonuc2
    }
    // 4. soru
    fun harfbulucu(metin:String){
        var metinBoyutu = metin.length
        var sayac = 0
        for(i in 0..metinBoyutu-1){
            if(metin[i].toChar() == 'a'){
                sayac = sayac + 1
            }
        }
        println("Metindeki a sayisinin değeri : $sayac")
    }
    // 5. soru
    fun icAcilarToplami(kenarSayisi:Int){
    var icAcilarToplamiSonuc = (kenarSayisi -2) * 180
        println("İç açıları toplamı: $icAcilarToplamiSonuc")
    }

    //6.Soru
    fun maasHesapla(gunSayisi:Int): Int{
        val toplamSaat = gunSayisi * 8
        return if(toplamSaat <= 160){
            toplamSaat * 10
        }else{
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }
    // 7.soru
    fun kotaHesap(kota : Int) : Int {
        var sonuc = 0
        if (kota <= 50 ){
            sonuc = 100
        }else {
            sonuc = (kota - 50) * 4 + 100
        }
        return sonuc
    }
}