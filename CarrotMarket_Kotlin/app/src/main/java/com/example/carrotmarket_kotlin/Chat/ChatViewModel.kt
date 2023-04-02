package com.example.carrotmarket_kotlin.Chat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R


// 데이터의 변경
// 뷰모델은 데이터의 변경사항을 알려주는 라이브 데이터를 가지고 있고
class ChatViewModel : ViewModel() {

    private val _chatValue = MutableLiveData<MutableList<ChatProductData>>()
    val chatValue : LiveData<MutableList<ChatProductData>> = _chatValue

    init {
        // 초기값 할당
        _chatValue.value = mutableListOf(
            ChatProductData(
                R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48,
                R.drawable.char1, "qweasd", "운암동","3달 전","3333218537549"
            ),
            ChatProductData(
                R.drawable.around_place,R.drawable.around_book,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"
            ),
            ChatProductData(
                R.drawable.around_car,R.drawable.around_coupon,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"
            )
        )
    }

    fun addItem(item : ChatProductData) {
        val list = _chatValue.value ?: mutableListOf()
        list.add(item)
        _chatValue.value = list
    }

}