package com.example.carrotmarket_kotlin.Chat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R

class ChatAdapter(private val chatList: MutableList<ChatProductData>) : RecyclerView.Adapter<ChatAdapter.RecHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_chatfragment, parent, false)
        return RecHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: RecHolder, position: Int) {
        val carrotChat = chatList[position]
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    class RecHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}