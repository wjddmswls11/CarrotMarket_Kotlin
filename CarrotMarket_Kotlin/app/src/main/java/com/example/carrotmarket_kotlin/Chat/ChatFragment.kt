package com.example.carrotmarket_kotlin.Chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    lateinit var fBinding: FragmentChatBinding
    lateinit var chatList: MutableList<ChatProductData>

    lateinit var adapter: ChatAdapter
    lateinit var manager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fBinding = FragmentChatBinding.inflate(inflater, container, false)
        chatList = ArrayList<ChatProductData>().apply {
            add(
                ChatProductData(
                    R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48,R.drawable.char1, "qweasd", "운암동","3달 전","3333218537549"
                )
            )
            add(
                ChatProductData(
                    R.drawable.around_place,R.drawable.around_book,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"
                )
            )
            add(
                ChatProductData(
                    R.drawable.around_car,R.drawable.around_coupon,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"
                )
            )
        }

        return fBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }


    private fun setRecyclerView() {
        adapter = ChatAdapter(chatList)
        manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        fBinding.Chat001MainProductRecyclerView.adapter = adapter
        fBinding.Chat001MainProductRecyclerView.layoutManager = manager
    }





}