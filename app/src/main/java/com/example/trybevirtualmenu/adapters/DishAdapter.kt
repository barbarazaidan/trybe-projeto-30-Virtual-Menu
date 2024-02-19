package com.example.trybevirtualmenu.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.interfaces.IClickEventListener
import com.example.trybevirtualmenu.models.Dish
import com.example.trybevirtualmenu.models.dishesList
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

// aqui é criada a instância da lista dos pratos no menu
class DishAdapter(private val dishes: List<Dish>): RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    class DishViewHolder(private val itemView: View, private val listener: IClickEventListener?) : RecyclerView.ViewHolder(itemView) {
        val imageDish: ShapeableImageView = itemView.findViewById(R.id.item_menu_image)
        val nameDish: MaterialTextView = itemView.findViewById(R.id.item_menu_name)

        init {
            itemView.setOnClickListener { listener?.onClick(it, absoluteAdapterPosition) }
        }
    }

    // o valor inicial é nulo porque assim que eu crio o adapter não tem listener, não cliquei em nada,
    // então o valor é nulo
    private var listener: IClickEventListener? = null
    fun setOnItemClickListener(listener: IClickEventListener){
        this.listener = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        Log.d("DishAdapter", "onCreateViewHolder called")
        // o view representa o card dos pratos
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_layout, parent, false)
        return DishViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.imageDish.setImageResource(dishesList[position].image)
        holder.nameDish.text = dishesList[position].name

    }
    override fun getItemCount(): Int {
        return dishes.size
    }
}