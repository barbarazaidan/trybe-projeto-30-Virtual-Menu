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
        val imageDish: ShapeableImageView? = itemView.findViewById(R.id.detail_image)
        val nameDish: MaterialTextView? = itemView.findViewById(R.id.detail_name)
        val descriptionDish: MaterialTextView? = itemView.findViewById(R.id.detail_description)
        val priceDish: MaterialTextView? = itemView.findViewById(R.id.detail_price)

        imageDish?.setImageResource(dish.image)
        nameDish?.text = dish.name
        descriptionDish?.text = dish.description
        priceDish?.text = dish.price.toString()
    }

    init{
        itemView.setOnClickListener(this)
    }

    override fun onClick(p0: View?){}
}
