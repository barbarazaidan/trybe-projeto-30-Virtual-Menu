package com.example.trybevirtualmenu.views

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.models.dishesList
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class MenuItemDetailActivity : AppCompatActivity() {

    private lateinit var nameDish: MaterialTextView
    private lateinit var descriptionDish: MaterialTextView
    private lateinit var priceDish: MaterialTextView
    private lateinit var imageDish: ShapeableImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        // val dishId = intent.getIntExtra("dish_id", -1)
//        if (dishId !== -1) {
//            val dish = dishesList.find { it.id == dishId }
//            if (dish != null) {
//                updateUIWithDishDetails(dish)
//            } else {
//                Log.d("MenuItemDetailActivity", "Prato não encontrado")
//            }
//        } else {
//            Log.d("MenuItemDetailActivity", "Id incorreto")
//        }

        nameDish = findViewById(R.id.detail_name)
        descriptionDish = findViewById(R.id.detail_description)
        priceDish = findViewById(R.id.detail_price)
        imageDish = findViewById(R.id.detail_image)

        val dishId = intent.getIntExtra("dish_id", -1)
        val dish = dishesList[dishId]

        nameDish.text = dish.name
        descriptionDish.text = dish.description
        priceDish.text = dish.price
        imageDish.setImageResource(dish.image)


//        val backButton: MaterialButton = findViewById(R.id.detail_back)
//        backButton.setOnClickListener {
//            finish()
//        }
    }
}

//private fun updateUIWithDishDetails(dish: Dish) {
//        // Encontrou o prato, agora atualize as visualizações com os detalhes do prato
//
//        val nameDish: TextView = findViewById(R.id.detail_name)
//        val descriptionDish: TextView = findViewById(R.id.detail_description)
//        val priceDish: TextView = findViewById(R.id.detail_price)
//
//        nameDish.text = dish.name
//        descriptionDish.text = dish.description
//        priceDish.text = dish.price.toString()
//    }
//}

