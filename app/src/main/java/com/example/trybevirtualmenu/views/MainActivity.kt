package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.DishAdapter
import com.example.trybevirtualmenu.interfaces.IClickEventListener
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.models.dishesList
import com.example.trybevirtualmenu.views.MenuItemDetailActivity

class MainActivity : AppCompatActivity(), IClickEventListener {
    // iniciando o projeto
    private lateinit var menuRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuRecyclerView = findViewById(R.id.main_menu)
        menuRecyclerView.layoutManager = LinearLayoutManager(this)

        val adapterDish = DishAdapter(dishesList, this)
        menuRecyclerView.adapter = adapterDish
    }

    override fun onClick(position: Int) {
        val clickedItem = dishesList[position]
        Log.d("MainActivity", "Item clicked: ${clickedItem.name}, Dish ID: ${clickedItem.id}")
        val it = Intent(this, MenuItemDetailActivity::class.java)
        it.putExtra("dish_id", clickedItem.id)
        startActivity(it)
    }
}
