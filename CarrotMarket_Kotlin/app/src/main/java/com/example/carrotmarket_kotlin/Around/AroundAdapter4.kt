package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class AroundAdapter4(private val aroundList4: MutableList<AroundProductData4>) : RecyclerView.Adapter<AroundAdapter4.Recholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_aroundfragmentmini, parent, false)
        return Recholder(viewLayout)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        val carrotAround4 = aroundList4[position]
    }

    override fun getItemCount(): Int {
        return aroundList4.size
    }

    class Recholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}