package com.example.kisileruygulamasi.data.repo

import android.util.Log
import com.example.kisileruygulamasi.data.datasource.KisilerDataSource

class KisilerRepository {
    var kisilerDataSource = KisilerDataSource()
    suspend fun guncelle(kisi_id:Int,kisi_ad: String,kisi_tel: String)
    = kisilerDataSource.guncelle((kisi_id,kisi_ad,kisi_tel)
}