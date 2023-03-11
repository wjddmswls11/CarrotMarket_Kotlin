package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class AroundAdapter5(private val aroundList5: MutableList<AroundProductData5>) : RecyclerView.Adapter<AroundAdapter5.Recholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_aroundfragment_shop, parent, false)
        return Recholder(viewLayout)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        val carrotAround4 = aroundList5[position]
    }

    override fun getItemCount(): Int {
        return aroundList5.size
    }

    class Recholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}