package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentShopBinding

class AroundAdapter5(private val aroundList5: MutableList<AroundProductData5>) : RecyclerView.Adapter<AroundAdapter5.Recholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val aBinding = ItemAroundfragmentShopBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Recholder(aBinding)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        holder.bind(aroundList5[position])
    }

    override fun getItemCount(): Int {
        return aroundList5.size
    }

    class Recholder(
        private val aBinding : ItemAroundfragmentShopBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {

        fun bind(item : AroundProductData5) {
            Glide.with(itemView).apply {
                load(item.around_shopimg).into(aBinding.aroundShopimg)
                load(item.around_shop_favimg).into(aBinding.aroundShopFavimg)
            }

            aBinding.apply {
                aroundShopShopname.text = item.around_shop_shopname
                aroundShopLoad.text = item.around_shop_load
                aroundShopProduct.text = item.around_shop_product
                aroundShopPercent.text = item.around_shop_percent
                aroundShopWon.text = item.around_shop_won
                aroundShopLike.text = item.around_shop_like
            }
        }

    }

}