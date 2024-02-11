package com.example.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.DishAdapter
import com.example.trybevirtualmenu.interfaces.IClickEventListener
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.models.dishesList

class MainActivity : AppCompatActivity(), IClickEventListener {
    // iniciando o projeto
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_menu)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = DishAdapter(dishesList, this)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        val dish = dishesList[position]
    }
}
