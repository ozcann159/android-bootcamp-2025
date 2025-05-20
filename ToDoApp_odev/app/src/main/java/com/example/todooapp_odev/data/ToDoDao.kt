package com.example.todooapp_odev.data // Paket adınızı kontrol edin

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(toDo: ToDo)

    @Update
    suspend fun updateToDo(toDo: ToDo)

    @Delete
    suspend fun deleteToDo(toDo: ToDo)

    @Query("SELECT * FROM toDos ORDER BY id DESC")
    fun getAllToDos(): Flow<List<ToDo>>

    @Query("SELECT * FROM toDos WHERE name LIKE :query ORDER BY id DESC")
    fun searchToDos(query: String): Flow<List<ToDo>> // Arama için

    @Query("SELECT * FROM toDos WHERE id = :id")
    suspend fun getToDoById(id: Int): ToDo?
}