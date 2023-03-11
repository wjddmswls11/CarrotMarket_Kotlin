package com.example.carrotmarket_kotlin.Chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    lateinit var fBinding: FragmentChatBinding
    lateinit var ChatList: MutableList<ChatProductData>

/*    lateinit var adapter: ChatAdapter*/
    lateinit var manager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fBinding = FragmentChatBinding.inflate(inflater, container, false)
        /*val chatList: ArrayList<ChatProductData> = ArrayList<ChatProductData>().apply {
            add(
                ChatProductData(

                )
            )
        }*/

        return fBinding.root
    }









}