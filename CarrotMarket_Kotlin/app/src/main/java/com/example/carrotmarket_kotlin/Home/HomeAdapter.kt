package com.example.carrotmarket_kotlin.Home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.databinding.ActivityHomeBinding
import com.example.carrotmarket_kotlin.databinding.ItemHomeProductListBinding


class HomeAdapter(private val homeList: MutableList<HomeProductData>) : RecyclerView.Adapter<HomeAdapter.RecHolder>(
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val aBinding = ItemHomeProductListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val bBinding = ActivityHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecHolder(aBinding, bBinding)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        holder.bind(homeList[position])

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, HomeActivity::class.java)
            intent.putExtra("fromHome", homeList[position])
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }

    override fun getItemCount(): Int {
        return homeList.size
    }

    class RecHolder(
        private val aBinding: ItemHomeProductListBinding,
        private val bBinding: ActivityHomeBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item: HomeProductData) {
            Glide.with(itemView).apply {
                load(item.img_home).into(aBinding.imgHome)
                load(item.img_home_chat).into(aBinding.imgHomeChat)
                load(item.img_home_favorite).into(aBinding.imgHomeFavorite)

                load(item.home_intent_look).into(bBinding.homeIntentimg1)
                load(item.home_intent_contents).into(bBinding.homeIntentimg2)
                load(item.home_intent_type).into(bBinding.homeIntentimg3)
            }

            aBinding.apply {
                tvHome1.text = item.tv_home1
                tvHome2.text = item.tv_home2
                tvHome3.text = item.tv_home3
                tvHome4.text = item.tv_home4
                tvHomeChat.text = item.tv_home_chat
                tvHomeFavorite.text = item.tv_home_favorite
            }

            bBinding.apply {
                homeIntentFavor.text = item.tv_home_favorite
                homeIntentLook.text = item.home_intent_look
            }
        }
    }
}

