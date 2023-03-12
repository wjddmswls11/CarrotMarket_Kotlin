package com.example.carrotmarket_kotlin.Home

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ActivityMainBinding.inflate
import com.example.carrotmarket_kotlin.databinding.ItemHomeProductListBinding
import java.util.*


class HomeAdapter(private val homeList: MutableList<HomeProductData>) : RecyclerView.Adapter<HomeAdapter.RecHolder>(
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val aBinding =
            ItemHomeProductListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecHolder(aBinding)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {www
        holder.bind(homeList[position])
    }

    override fun getItemCount(): Int {
        return homeList.size
    }


    class RecHolder(private val aBinding: ItemHomeProductListBinding) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item: HomeProductData) {
            aBinding.tvHome1.text = item.tv_home1
            Glide.with(itemView).load(item.img_home).into(aBinding.imgHome)
        }
    }
}

