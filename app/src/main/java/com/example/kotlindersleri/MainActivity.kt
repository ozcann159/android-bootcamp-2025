package com.example.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str: String? = null
    lateinit var info:String // Daha sonra bu değişkene değer atayacağım demek.
    var x:Int = 0
    var y:Double = 0.0
    var kontrol :Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info ="Bilgi"
    }

}