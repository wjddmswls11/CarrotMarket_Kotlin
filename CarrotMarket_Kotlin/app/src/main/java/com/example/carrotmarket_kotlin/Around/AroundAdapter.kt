package com.example.carrotmarket_kotlin.Around

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemAroundfragmentBinding

class AroundAdapter(private val aroundList: MutableList<AroundProductData>) : RecyclerView.Adapter<AroundAdapter.RecHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val aBinding = ItemAroundfragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecHolder(aBinding)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        holder.bind(aroundList[position])
    }

    override fun getItemCount(): Int {
        return aroundList.size
    }

    class RecHolder(
        private val aBinding : ItemAroundfragmentBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item : AroundProductData) {
            Glide.with(itemView).load(item.around_img_first).into(aBinding.aoundImgFirst)
            aBinding.aroundTxtFirst.text = item.around_txt_first
        }

    }


}