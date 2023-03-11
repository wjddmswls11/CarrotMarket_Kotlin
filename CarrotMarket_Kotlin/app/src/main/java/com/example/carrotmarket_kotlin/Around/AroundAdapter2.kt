package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class AroundAdapter2(private val aroundList2: MutableList<AroundProductData2>) : RecyclerView.Adapter<AroundAdapter2.Recholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_aroundfragment_coupon, parent, false)
        return  Recholder(viewLayout)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        val carrotAround2 = aroundList2[position]
    }

    override fun getItemCount(): Int {
        return aroundList2.size
    }

    class Recholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}