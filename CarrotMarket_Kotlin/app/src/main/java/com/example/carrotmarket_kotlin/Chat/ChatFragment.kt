package com.example.carrotmarket_kotlin.Chat

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    lateinit var fBinding: FragmentChatBinding
    lateinit var viewModel: ChatViewModel

    lateinit var adapter: ChatAdapter
    lateinit var manager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fBinding = FragmentChatBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)


        return fBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }
    private fun setRecyclerView() {
        adapter = ChatAdapter(viewModel.chatValue.value ?: mutableListOf())
        manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        fBinding.Chat001MainProductRecyclerView.adapter = adapter
        fBinding.Chat001MainProductRecyclerView.layoutManager = manager
    }
}