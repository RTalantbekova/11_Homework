package com.example.l11_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

private var positions : Int = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAdapter()
        onClick()
    }

    private fun setupAdapter(){
        val adapter = SpinnerAdapter(applicationContext, R.id.tvSpinner, getSpinnerData())
        spinner.adapter = adapter
    }

    private fun getSpinnerData() : ArrayList<LayoutType>{
        val data = arrayListOf<LayoutType>()
        data.add(LayoutType("Choose Layout Type"))
        data.add(LayoutType("Grid Layout"))
        data.add(LayoutType("Linear layout"))

        return data
    }

    private fun onClick(){
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent : AdapterView<*>?, view : View, position : Int, id : Long) {
                positions = position
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        btnGo.setOnClickListener {
            if (positions == 1){
                val intent = Intent(applicationContext, GridActivity ::class.java)
                startActivity(intent)
            }
            else if (positions == 2){
                val intent = Intent(applicationContext, LinearActivity ::class.java)
                startActivity(intent)
            }
        }
    }
}
