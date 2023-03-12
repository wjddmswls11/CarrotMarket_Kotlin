package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentCouponBinding

class AroundAdapter2(private val aroundList2: MutableList<AroundProductData2>) : RecyclerView.Adapter<AroundAdapter2.Recholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val aBindding = ItemAroundfragmentCouponBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  Recholder(aBindding)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        holder.bind(aroundList2[position])
    }

    override fun getItemCount(): Int {
        return aroundList2.size
    }

    class Recholder(
        private val aBinding : ItemAroundfragmentCouponBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {


        fun bind(item: AroundProductData2) {
            Glide.with(itemView).apply {
                load(item.store1_1).into(aBinding.store11)
                load(item.store1_2).into(aBinding.store12)
            }

            aBinding.apply {
                aroundStorename.text = item.around_storename
                storeInfo.text = item.store_info
                storeDistance.text = item.store_distance
                storeReview1.text = item.store_review1
                storeReview2.text = item.store_review2
                storeCustom.text = item.store_custom
                storeGuest.text = item.store_guest

            }



        }



    }

}