package com.example.todooapp_odev.ui.kayitsayfa // Paket adınızı kontrol edin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todooapp_odev.data.ToDo
import com.example.todooapp_odev.data.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KayitSayfaViewModel @Inject constructor(private val repository: ToDoRepository) : ViewModel() {

    fun insertToDo(name: String) = viewModelScope.launch {
        if (name.isNotBlank()) {
            val newToDo = ToDo(name = name)
            repository.insertToDo(newToDo)
        }
    }

    fun updateToDo(toDo: ToDo) = viewModelScope.launch {
        if (toDo.name.isNotBlank()) {
            repository.updateToDo(toDo)
        }
    }

    // Eğer Kayıt sayfası aynı zamanda düzenleme için de kullanılacaksa,
    // ID ile ToDo getirme fonksiyonu faydalı olabilir.
    suspend fun getToDoById(id: Int): ToDo? {
        return repository.getToDoById(id)
    }
}