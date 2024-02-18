package com.example.trybevirtualmenu.interfaces

import android.content.Intent
import com.example.trybevirtualmenu.models.dishesList
import com.example.trybevirtualmenu.views.MenuItemDetailActivity

// não posso colocar uma implementação vazia na função, pois assim estou dizendo que
// implementação é opcional para as classes que implementam a interface.
// Quando forneço uma implementação padrão, as classes que implementam a interface têm a opção de usá-la
// ou substituí-la. E aqui eu quero que a função onClick seja obrigatoriamente implementada
// pelas classes que usam a interface
interface IClickEventListener {
    fun onClick(position: Int)
}