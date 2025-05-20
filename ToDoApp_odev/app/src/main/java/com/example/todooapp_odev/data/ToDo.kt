package com.example.todooapp_odev.data // Paket adınızı kontrol edin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable // Navigasyon ile nesne göndermek için eklendi

@Entity(tableName = "toDos")
data class ToDo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "name")
    var name: String
) : Serializable // Serializable arayüzünü implement edin