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
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_home_product_list ,parent,false  );
        // val iBinding =  LayoutInflater.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        val carrotHome = homeList[position]
        holder.tv_home1.text = carrotHome.tv_home1
        holder.imghome.setImageResource(carrotHome.img_home)
    }

    override fun getItemCount(): Int {
        return homeList.size
    }




    class RecHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
            val imghome = itemView.findViewById<ImageView>(R.id.img_home)
            val tv_home1 = itemView.findViewById<TextView>(R.id.tv_home1)
        }
    }

