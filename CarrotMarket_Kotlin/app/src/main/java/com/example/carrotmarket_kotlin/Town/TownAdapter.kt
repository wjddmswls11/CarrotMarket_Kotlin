package com.example.carrotmarket_kotlin.Town

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.Home.HomeAdapter
import com.example.carrotmarket_kotlin.Home.HomeProductData
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemTownfragmentBinding

class TownAdapter(private val townList: MutableList<TownProductData>) : RecyclerView.Adapter<TownAdapter.RecHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val aBinding = ItemTownfragmentBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return RecHolder(aBinding)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        holder.bind(townList[position])

    }

    override fun getItemCount(): Int {
        return townList.size
    }


    class RecHolder(private val aBinding: ItemTownfragmentBinding) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item: TownProductData) {
//            Glide.with(itemView).load(item.img_town_map).into(aBinding.imgTown2)
//            Glide.with(itemView).load(item.img_town_talk).into(aBinding.imgTown3)

            aBinding.tvTownBtn.text = item.tvTownBtn
            aBinding.tvTown1.text = item.tvTownOrange
            aBinding.tvTown2.text = item.tvTownConten
            aBinding.tvTownId.text = item.tvTownID


        }



    }
}