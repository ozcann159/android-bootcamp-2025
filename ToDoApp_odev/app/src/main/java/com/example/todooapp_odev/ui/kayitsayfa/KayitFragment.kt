package com.example.todooapp_odev.ui.kayitsayfa // Paket adınızı kontrol edin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.todooapp_odev.data.ToDo
import com.example.todooapp_odev.databinding.FragmentKayitBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class KayitFragment : Fragment() {

    private var _binding: FragmentKayitBinding? = null
    private val binding get() = _binding!!

    private val viewModel: KayitSayfaViewModel by viewModels()
    private val args: KayitFragmentArgs by navArgs() // Navigasyon argümanlarını almak için

    private var currentToDo: ToDo? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        currentToDo = args.toDoItem // Gelen argümanı al

        currentToDo?.let {
            binding.editTextToDoName.setText(it.name)
            binding.buttonSave.text = "Güncelle"
            // İsterseniz Toolbar başlığını da değiştirebilirsiniz
            // (requireActivity() as AppCompatActivity).supportActionBar?.title = "Yapılacak Düzenle"
        }

        binding.buttonSave.setOnClickListener {
            saveOrUpdateToDo()
        }
    }

    private fun saveOrUpdateToDo() {
        val toDoName = binding.editTextToDoName.text.toString().trim()

        if (toDoName.isEmpty()) {
            Snackbar.make(requireView(), "Yapılacak adı boş olamaz!", Snackbar.LENGTH_SHORT).show()
            return
        }

        if (currentToDo == null) { // Yeni kayıt
            viewModel.insertToDo(toDoName)
            Snackbar.make(requireView(), "$toDoName eklendi", Snackbar.LENGTH_SHORT).show()
        } else { // Güncelleme
            val updatedToDo = currentToDo!!.copy(name = toDoName)
            viewModel.updateToDo(updatedToDo)
            Snackbar.make(requireView(), "$toDoName güncellendi", Snackbar.LENGTH_SHORT).show()
        }
        findNavController().popBackStack() // Bir önceki ekrana dön
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}