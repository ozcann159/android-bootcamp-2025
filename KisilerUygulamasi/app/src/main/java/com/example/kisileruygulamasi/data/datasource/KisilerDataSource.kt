package com.example.kisileruygulamasi.data.datasource

import android.util.Log

class KisilerDataSource {


    suspend fun guncelle(kisi_id:Int,kisi_ad: String,kisi_tel: String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")
    }
}