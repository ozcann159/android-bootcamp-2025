package com.example.todooapp_odev.ui.anasayfa // Paket adınızı kontrol edin

import androidx.lifecycle.*
import com.example.todooapp_odev.data.ToDo
import com.example.todooapp_odev.data.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(private val repository: ToDoRepository) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    // Arama sorgusuna göre filtrelenmiş ToDo listesi
    val toDos: StateFlow<List<ToDo>> = _searchQuery
        .flatMapLatest { query -> // flatMapLatest, query değiştiğinde yeni bir Flow başlatır
            if (query.isBlank()) {
                repository.getAllToDos()
            } else {
                repository.searchToDos(query)
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Lazily, // Gözlemci olduğunda başlar
            initialValue = emptyList()
        )

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun deleteToDo(toDo: ToDo) = viewModelScope.launch {
        repository.deleteToDo(toDo)
    }
}