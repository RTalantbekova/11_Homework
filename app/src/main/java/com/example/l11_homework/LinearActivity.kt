package com.example.l11_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class LinearActivity : AppCompatActivity() {
    private var recyclerView : RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
        initViews()
        showList()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rvLinear)
    }

    private fun showList(){
        var list = arrayListOf<String>()
        for (i in 1..20){
            list.add("Linear Layout")
        }
        val adapter = LinearAdapter(list)
        recyclerView?.adapter = adapter
    }
}