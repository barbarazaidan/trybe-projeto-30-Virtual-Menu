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
import com.example.trybevirtualmenu.models.dishesList

class MainActivity : AppCompatActivity(), IClickEventListener {
    // iniciando o projeto
    private lateinit var menuList: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuList = findViewById(R.id.main_menu)
        menuList.layoutManager = LinearLayoutManager(this)

        val adapterDish = DishAdapter(dishesList)
        adapterDish.setOnItemClickListener(this)
        menuList.adapter = adapterDish
    }

     override fun onClick(view: View, position: Int) {
         // precisei criar o dishClicked para pegar o id do prato e fazer a lógica
         // na próxima activity. Do contrário, ele pegava dishId começava em zero
         val dishClicked = dishesList[position]
         val intent = Intent(baseContext, MenuItemDetailActivity::class.java)
         intent.putExtra("dish_id", dishClicked.id)
         startActivity(intent)
     }
}