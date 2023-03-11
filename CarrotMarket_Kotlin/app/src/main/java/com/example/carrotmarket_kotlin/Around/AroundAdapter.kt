package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class AroundAdapter(private val aroundList: MutableList<AroundProductData>) : RecyclerView.Adapter<AroundAdapter.RecHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_aroundfragment, parent, false)
        return RecHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        val carrotAround = aroundList[position]
    }

    override fun getItemCount(): Int {
        return aroundList.size
    }

    class RecHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}