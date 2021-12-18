package com.example.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActivityAdpater(private val list: ArrayList<String>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = list[position]
//        holder.textView2.text = list[position]

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val textView  = view.findViewById<TextView>(R.id.textView)
//    val textView2 = view.findViewById<TextView>(R.id.textView2)
}