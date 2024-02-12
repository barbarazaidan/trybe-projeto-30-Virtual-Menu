package com.example.trybevirtualmenu.interfaces

import android.content.Intent
import com.example.trybevirtualmenu.models.dishesList
import com.example.trybevirtualmenu.views.MenuItemDetailActivity

interface IClickEventListener {
    fun onItemClick(position: Int) {}
}