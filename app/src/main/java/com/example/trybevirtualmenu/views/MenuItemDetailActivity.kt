package com.example.trybevirtualmenu.views

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.models.dishesList
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MenuItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MenuItemDetailActivity", "onCreate called")
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("dish_id", -1)
        if (dishId !== -1) {
            val dish = dishesList.find { it.id == dishId }
            if (dish != null) {
                updateUIWithDishDetails(dish)
            } else {
                Log.d("MenuItemDetailActivity", "Prato não encontrado")
            }
        } else {
            Log.d("MenuItemDetailActivity", "Id incorreto")
        }

        val backButton: MaterialButton = findViewById(R.id.detail_back)
        backButton.setOnClickListener {
            finish()
        }

    }

private fun updateUIWithDishDetails(dish: Dish) {
        // Encontrou o prato, agora atualize as visualizações com os detalhes do prato

        val nameDish: TextView = findViewById(R.id.detail_name)
        val descriptionDish: TextView = findViewById(R.id.detail_description)
        val priceDish: TextView = findViewById(R.id.detail_price)

        nameDish.text = dish.name
        descriptionDish.text = dish.description
        priceDish.text = dish.price.toString()
    }
}

