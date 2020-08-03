package com.example.l11_homework

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SpinnerAdapter(context: Context, resource : Int, private val objects: List<LayoutType>) :
    ArrayAdapter<LayoutType>(context, resource, objects)
{
    @SuppressLint("Viewholder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.spinner_list, parent, false)
        val tvSpinner = view.findViewById<TextView>(R.id.tvSpinner)
        tvSpinner.text = objects[position].layoutName
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.dropdown_list, parent, false)
        val tvName = view.findViewById<TextView>(R.id.tvName)

        tvName.text = objects[position].layoutName

        return view
    }
}

class LinearAdapter(private val array : ArrayList<String>) : RecyclerView.Adapter<LinearViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_linear,parent,false)
        return LinearViewHolder(view)
    }

    override fun getItemCount() = array.size

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        holder.bind(array[position] )
    }
}

class GridAdapter(private val array : ArrayList<String>) : RecyclerView.Adapter<GridViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_grid, parent,false)
        return GridViewHolder(view)
    }

    override fun getItemCount() = array.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
         holder.bind(array[position])
    }

}