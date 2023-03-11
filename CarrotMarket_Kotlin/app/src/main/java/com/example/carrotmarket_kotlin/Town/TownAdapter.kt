package com.example.carrotmarket_kotlin.Town

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.Home.HomeAdapter
import com.example.carrotmarket_kotlin.R

class TownAdapter(private val townList: MutableList<TownProductData>) : RecyclerView.Adapter<TownAdapter.RecHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_townfragment ,parent,false  );
        return RecHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        val carrotTown = townList[position]
    }

    override fun getItemCount(): Int {
        return townList.size
    }

    class RecHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}