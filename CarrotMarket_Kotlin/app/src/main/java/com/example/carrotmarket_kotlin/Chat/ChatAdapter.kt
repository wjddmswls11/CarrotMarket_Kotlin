package com.example.carrotmarket_kotlin.Chat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ItemChatfragmentBinding

class ChatAdapter(private val chatList: MutableList<ChatProductData>) : RecyclerView.Adapter<ChatAdapter.RecHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val aBinding = ItemChatfragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecHolder(aBinding)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        holder.bind(chatList[position])
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    class RecHolder(
        private val aBinding : ItemChatfragmentBinding
    ) : RecyclerView.ViewHolder(aBinding.root) {
        fun bind(item: ChatProductData) {
            Glide.with(itemView).apply {
                load(item.chat_pro).into(aBinding.chatPro)
                load(item.img_chat).into(aBinding.imgChat)
            }
            aBinding.apply {
                chatId.text = item.chat_id
                chatCon.text = item.chat_con
                chatTime.text = item.chat_time
                chatTown.text = item.chat_town
            }
        }
    }

}