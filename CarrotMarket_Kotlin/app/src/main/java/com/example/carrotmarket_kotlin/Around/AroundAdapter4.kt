package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentminiBinding

class AroundAdapter4(private val aroundList4: MutableList<AroundProductData4>) : RecyclerView.Adapter<AroundAdapter4.Recholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recholder {
        val aBinding = ItemAroundfragmentminiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Recholder(aBinding)
    }

    override fun onBindViewHolder(holder: Recholder, position: Int) {
        holder.bind(aroundList4[position])
    }

    override fun getItemCount(): Int {
        return aroundList4.size
    }

    class Recholder(
        private val aBinding : ItemAroundfragmentminiBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item : AroundProductData4) {
            Glide.with(itemView).apply {
                load(item.around_mini_img).into(aBinding.aroundMiniImg)
                load(item.around_mini_perimgper).into(aBinding.aroundMiniPerimgper)
            }

            aBinding.apply {
                miniTitle.text = item.mini_title
                miniTitleDetail.text = item.mini_title_detail
                aroundMiniStar.text = item.around_mini_star
                aroundMiniReviewtxt.text = item.around_mini_reviewtxt
                aroundMiniWhitedetail.text = item.around_mini_whitedetail
                aoundMiniReview.text = item.aound_mini_review

            }

        }

    }

}