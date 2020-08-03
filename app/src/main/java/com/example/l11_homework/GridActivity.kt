package com.example.l11_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GridActivity : AppCompatActivity() {
    private var recyclerGv : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        initView()
        setupAdapter()
        getData()
    }

    private fun initView(){
        recyclerGv = findViewById(R.id.rvGrid)
    }

    private fun setupAdapter(){
        recyclerGv?.layoutManager = GridLayoutManager(applicationContext, 2, RecyclerView.VERTICAL, false)

    }

    private fun getData(){
        val list = arrayListOf<String>()

        for (i in 1..50){
            list.add("Grid Layout")
        }
        val adapter = GridAdapter(list)
        recyclerGv?.adapter = adapter

    }
}