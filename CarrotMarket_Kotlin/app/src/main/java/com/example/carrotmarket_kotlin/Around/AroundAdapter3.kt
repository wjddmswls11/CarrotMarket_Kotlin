package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.Home.HomeProductData
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentBinding
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentCoupon2Binding

class AroundAdapter3(private val aroundList3 : MutableList<AroundProductData3>) : RecyclerView.Adapter<AroundAdapter3.Recholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val aBinding = ItemAroundfragmentCoupon2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Recholder(aBinding)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        holder.bind(aroundList3[position])
    }

    override fun getItemCount(): Int {
        return aroundList3.size
    }


    class Recholder(
        private val aBinding: ItemAroundfragmentCoupon2Binding
        ) : RecyclerView.ViewHolder(aBinding.root){
        fun bind(item: AroundProductData3) {
            Glide.with(itemView).apply {
                load(item.around_coupon).into(aBinding.aroundCoupon)
                load(item.around_coupon_perimgper).into(aBinding.aroundCouponPerimgper)
                load(item.popup_coupon).into(aBinding.popupCoupon)
            }

            aBinding.apply {
                aroundCouponShopname.text = item.around_coupon_shopname
                aroundCouponDistance.text = item.around_coupon_distance
                arouondCouponInfo.text = item.arouond_coupon_info
                aroundCouponPerson.text = item.around_coupon_person
                couponGuest.text = item.coupon_guest
                couponReview.text = item.coupon_review
            }
        }
    }

}