package com.example.kisileruygulamasi.ui.fragment.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerRepository

class AnasayfaViewModel: ViewModel() {
    var kisilerRepository = KisilerRepository()
}