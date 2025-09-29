package com.example.myapi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar
    private lateinit var btnAdd: Button
    private lateinit var etTitle: EditText
    private lateinit var etDescription: EditText
    private lateinit var etImageUrl: EditText

    private val items = mutableListOf<Item>()
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        progressBar = findViewById(R.id.progressBar)
        btnAdd = findViewById(R.id.btnAdd)
        etTitle = findViewById(R.id.etTitle)
        etDescription = findViewById(R.id.etDescription)
        etImageUrl = findViewById(R.id.etImageUrl)

        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter

        btnAdd.setOnClickListener {
            val title = etTitle.text.toString()
            val description = etDescription.text.toString()
            val imageUrl = etImageUrl.text.toString()

            if (title.isNotEmpty() && description.isNotEmpty() && imageUrl.isNotEmpty()) {
                val newItem = Item(imageUrl, title, description)
                items.add(newItem)
                adapter.notifyItemInserted(items.size - 1)
                recyclerView.scrollToPosition(items.size - 1)

                // Limpiar campos
                etTitle.text.clear()
                etDescription.text.clear()
                etImageUrl.text.clear()
            } else {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        // Aquí podrías cargar datos iniciales desde API con Retrofit si quieres
    }
}
