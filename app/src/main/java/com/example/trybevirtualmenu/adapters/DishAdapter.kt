package com.example.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.interfaces.IClickEventListener
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.views.DishViewHolder

class DishAdapter(private val dishes: List<Dish>, private val clickListener: IClickEventListener): RecyclerView.Adapter<DishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)
        return DishViewHolder(view, clickListener)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {

        val dish = dishes[position]

        holder.bind(dish)
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}