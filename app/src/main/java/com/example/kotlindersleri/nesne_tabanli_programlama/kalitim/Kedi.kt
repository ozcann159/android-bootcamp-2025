package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi : Memeli() {
    override fun sesCikar(){
        //super.sesCikar() -> super: kalıtım ile üst sınıf (Memeli) temsil
        println("Miyav Miyav")
    }
}