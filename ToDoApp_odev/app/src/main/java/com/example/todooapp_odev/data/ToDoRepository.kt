package com.example.todooapp_odev.data // Paket adınızı kontrol edin

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    fun getAllToDos(): Flow<List<ToDo>> = toDoDao.getAllToDos()

    fun searchToDos(query: String): Flow<List<ToDo>> = toDoDao.searchToDos("%$query%")

    suspend fun insertToDo(toDo: ToDo) {
        toDoDao.insertToDo(toDo)
    }

    suspend fun updateToDo(toDo: ToDo) {
        toDoDao.updateToDo(toDo)
    }

    suspend fun deleteToDo(toDo: ToDo) {
        toDoDao.deleteToDo(toDo)
    }

    suspend fun getToDoById(id: Int): ToDo? {
        return toDoDao.getToDoById(id)
    }
}