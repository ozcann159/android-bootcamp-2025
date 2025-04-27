package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer almaktadır.
    //null, NaN, nil
    // 1.tanımlama
    var mesaj : String? = null
     mesaj = "Merhaba" // Deger aktarıldı

    // Yöntem 1
    //Sorun yoksa çalışır, sorun varsa uygulama çökmez
    println("Yöntem 1: ${mesaj?.uppercase()}") //mesajı büyük harfe çevirdi



    //Yöntem 2
    //Sorun yoksa çalıır, sorun varsa çöker
    //Çok emin olduğunuz kodlarda kullanabilirsiniz.
    // println("Yöntem 2: ${mesaj!!.uppercase()}")

    //Yöntem 3
    // null kontrol
    if (mesaj != null){ //içerisi null değilse(doluysa) çalış
        println("Yöntem 3: ${mesaj.uppercase()}")
    }else{
        println("Değişkende null yer almaktadır.")
    }

    //null kontrol
    mesaj?.let{
        println("Yöntem 3: ${mesaj.uppercase()}")
    }

}