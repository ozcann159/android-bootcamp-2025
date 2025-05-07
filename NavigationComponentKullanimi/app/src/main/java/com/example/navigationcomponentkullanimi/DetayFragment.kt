package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import android.util.Log


class DetayFragment : Fragment() {
    private lateinit var binding : FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs() // veri okuma
        val gelenMesaj = bundle.mesaj
        val gelenSayi = bundle.sayi
        
        binding.textViewSonuc.text = "$gelenMesaj - $gelenSayi"

        val geriTusu = object : OnBackPressedCallback(true){ //true:geri dönüş aktif değil
            override fun handleOnBackPressed() {
                Log.e("Detay Sayfa", "Geri Tuşu çalıştı")
                isEnabled = false
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }
}