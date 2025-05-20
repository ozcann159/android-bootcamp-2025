package com.example.todooapp_odev.ui.anasayfa // Paket adınızı kontrol edin

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.todooapp_odev.R
import com.example.todooapp_odev.data.ToDo
import com.example.todooapp_odev.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private var _binding: FragmentAnasayfaBinding? = null
    private val binding get() = _binding!!

    private val viewModel: AnasayfaViewModel by viewModels()
    private lateinit var toDoAdapter: ToDoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        setupFab()
        observeToDos()
        setupSearchView()
        setupSwipeToDelete()
    }

    private fun setupRecyclerView() {
        toDoAdapter = ToDoAdapter(
            onItemClicked = { toDo ->
                // Detay/Güncelleme sayfasına git
                val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToKayitFragment(toDo)
                findNavController().navigate(action)
            },
            onDeleteClicked = { toDo ->
                viewModel.deleteToDo(toDo)
                Snackbar.make(requireView(), "${toDo.name} silindi", Snackbar.LENGTH_LONG)
                    .setAction("Geri Al") {
                        // Geri alma işlevi için ViewModel'e insert metodu eklenebilir
                        // viewModel.insertToDo(toDo) // Eğer geri alma isteniyorsa
                    }.show()
            }
        )
        binding.recyclerViewToDos.adapter = toDoAdapter
    }

    private fun setupFab() {
        binding.fabAddToDo.setOnClickListener {
            // Yeni kayıt sayfasına git (argüman olarak null gönderiyoruz)
            val action = AnasayfaFragmentDirections.actionAnasayfaFragmentToKayitFragment(null)
            findNavController().navigate(action)
        }
    }

    private fun observeToDos() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.toDos.collect { todosList ->
                    toDoAdapter.submitList(todosList)
                }
            }
        }
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true // Genellikle submit'te bir şey yapmayız, anlık arama yaparız
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                viewModel.setSearchQuery(newText.orEmpty())
                return true
            }
        })
    }

    private fun setupSwipeToDelete() {
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ) {
            override fun onMove(
                recyclerView: RecyclerView,// ... existing code ...
plugins {
    id 'com.android.application' version '8.2.2' apply false // Android Gradle Plugin version
    id 'org.jetbrains.kotlin.android' version '1.9.0' apply false // Kotlin plugin version
    id 'com.google.dagger.hilt.android' version '2.48' apply false // Hilt plugin version
}plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}

android {
    compileSdk 34
    // ... existing code ...
    defaultConfig {
        applicationId "com.example.todooapp_odev"
        minSdk 24
        targetSdk 34
        // ... existing code ...
    }
    // ... existing code ...
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    // ... existing code ...
}

dependencies {
    // ... existing code ...
    implementation "com.google.dagger:hilt-android:2.48"
    kapt "com.google.dagger:hilt-compiler:2.48"
}// ... existing code ...
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
android.useAndroidX=true
kotlin.code.style=official
android.nonTransitiveRClass=true...
distributionUrl=https\://services.gradle.org/distributions/gradle-8.2-bin.zip
...
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false // Sürükle bırak desteklenmiyor
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val toDo = toDoAdapter.currentList[position]
                    viewModel.deleteToDo(toDo)
                    Snackbar.make(requireView(), "${toDo.name} silindi", Snackbar.LENGTH_LONG)
                        .setAction("Geri Al") {
                            viewModel.insertToDo(toDo) // Geri alma işlevi aktif
                        }.show()
                }
            }
        }).attachToRecyclerView(binding.recyclerViewToDos)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Bellek sızıntılarını önlemek için
    }
}