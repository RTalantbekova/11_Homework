package com.example.l11_homework

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_grid.view.*
import kotlinx.android.synthetic.main.recycler_linear.view.*

class LinearViewHolder(view : View) : RecyclerView.ViewHolder(view){
    fun bind(item : String){
        itemView.txtLinear.text = item
    }
}

class GridViewHolder(view : View) : RecyclerView.ViewHolder(view){
    fun bind(item: String){
        itemView.txtGrid.text = item
    }
}