package com.example.todooapp_odev.ui.anasayfa // Paket adınızı kontrol edin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.todooapp_odev.data.ToDo
import com.example.todooapp_odev.databinding.ItemTodoBinding

class ToDoAdapter(
    private val onItemClicked: (ToDo) -> Unit,
    private val onDeleteClicked: (ToDo) -> Unit
) : ListAdapter<ToDo, ToDoAdapter.ToDoViewHolder>(ToDoDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val binding = ItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    inner class ToDoViewHolder(private val binding: ItemTodoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = getItem(position)
                    onItemClicked(item)
                }
            }
            binding.imageViewDelete.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = getItem(position)
                    onDeleteClicked(item)
                }
            }
        }

        fun bind(toDo: ToDo) {
            binding.textViewToDoName.text = toDo.name
        }
    }

    class ToDoDiffCallback : DiffUtil.ItemCallback<ToDo>() {
        override fun areItemsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
            return oldItem == newItem
        }
    }
}