package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class AroundAdapter3(private val aroundList3 : MutableList<AroundProductData3>) : RecyclerView.Adapter<AroundAdapter3.Recholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_aroundfragment_coupon2, parent, false)
        return Recholder(viewLayout)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        val carrotAround3 = aroundList3[position]
    }

    override fun getItemCount(): Int {
        return aroundList3.size
    }

    class Recholder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

}