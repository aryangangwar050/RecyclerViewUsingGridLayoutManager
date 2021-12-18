package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val noOfcolumns = 6
        recyclerView.layoutManager = GridLayoutManager(this,noOfcolumns)
        val item =  fetch()
        val data = ActivityAdpater(item)
        recyclerView.adapter = data
    }

    private fun fetch():ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 10000){
            list.add("text $i")
        }
        return list
    }
}
