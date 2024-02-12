package com.example.trybevirtualmenu.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.interfaces.IClickEventListener
import com.example.trybevirtualmenu.models.Dish
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class DishViewHolder(itemView: View, clickListener: IClickEventListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    fun bind(dish: Dish) {
        // no DishAdapter, configurei o item_menu_layout como RecyclerView. Sendo assim, aqui preciso chamar
        // os itens com os ids que estão presentes no arquivo item_menu_layout. Estava fazendo isso chamando
        // os ids do activity_menu_item-detail. Aí dava erro, pois o teste não conseguia encontrar os itens.

        val imageDish: ShapeableImageView? = itemView.findViewById(R.id.item_menu_image)
        val nameDish: MaterialTextView? = itemView.findViewById(R.id.item_menu_name)
        // val descriptionDish: MaterialTextView? = itemView.findViewById(R.id.detail_description)
        // val priceDish: MaterialTextView? = itemView.findViewById(R.id.detail_price)

        imageDish?.setImageResource(dish.image)
        nameDish?.text = dish.name
        // descriptionDish?.text = dish.description
        // priceDish?.text = dish.price.toString()
    }

    init{
        itemView.setOnClickListener(this)
    }

    override fun onClick(p0: View?){}
}
