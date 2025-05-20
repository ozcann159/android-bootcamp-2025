package com.example.todooapp_odev.di // Paket adınızı kontrol edin

import android.content.Context
import com.example.todooapp_odev.data.ToDoDao
import com.example.todooapp_odev.data.ToDoDatabase
// ToDoRepository'yi explicit olarak provide etmeye gerek yok, @Inject constructor yeterli.
// import com.example.todooapp_odev.data.ToDoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDatabase(@ApplicationContext context: Context): ToDoDatabase {
        return ToDoDatabase.getDatabase(context)
    }

    @Singleton
    @Provides
    fun provideToDoDao(database: ToDoDatabase): ToDoDao {
        return database.toDoDao()
    }

    /*
    // ToDoRepository zaten @Inject constructor kullandığı için Hilt bunu otomatik sağlar.
    // Eğer explicit olarak sağlamak isterseniz:
    @Singleton
    @Provides
    fun provideToDoRepository(toDoDao: ToDoDao): ToDoRepository {
        return ToDoRepository(toDoDao)
    }
    */
}