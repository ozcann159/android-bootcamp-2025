package com.example.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenMesaj = intent.getStringExtra("mesaj")

        binding.textViewSonuc.text = gelenMesaj
    }
}