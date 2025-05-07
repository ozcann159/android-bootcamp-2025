package com.example.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  //tasarıma baglanan kısım

        binding.ButtonDetay.setOnClickListener {   //Anasayfadaki butona eristik
            //binding.textViewAnasayfa.text = "Merhaba"  //butona tıklanınca merhaba yazacak
            val intent = Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("mesaj", "Selam, Nasılsın?") //veri aktarımı
            startActivity((intent))



        }
    }
}