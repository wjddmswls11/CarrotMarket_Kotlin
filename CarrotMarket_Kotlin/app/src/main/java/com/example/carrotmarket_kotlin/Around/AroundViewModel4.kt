package com.example.carrotmarket_kotlin.Around

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class AroundViewModel4 : ViewModel(){

    private val _aroundValue4 = MutableLiveData<MutableList<AroundProductData4>>()
    val aroundValue4 : LiveData<MutableList<AroundProductData4>> = _aroundValue4

    init {
        // 초기값 할당
        _aroundValue4.value = mutableListOf(
            AroundProductData4(
                R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.profile_round_person,
                "청소연구소","청소를 바꿉니다. 생활을 바꿉니...",
                "★ 3.9","후기 121",
                "너무 좋았어요! 화장실이랑 주방이 정말\n만족스러웠어요!저는 재택근무 하느...",
                "외 118명의 후기"
            ),
            AroundProductData4(
                R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.coupon_img22,
                "포스텔러","매일 400만명이 확인하고 힘을 얻...",
                "★ 3.8","후기 185",
                "중독성 있어서 하루에 한번씩 보네요^^\n감사합니다",
                "외 182명의 후기"
            ),
            AroundProductData4(
                R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.profile_round_person,
                "GS 마감할인판매","GS 마감할인상품이 당근마켓에...",
                "★ 4.4","후기 719",
                "편리하고 좋아요ㅎ 시간 예약과 결제까\n지 미리하고 가니까 원하는시간 쓱 찾...",
                "외 716명의 후기"
            ),
            AroundProductData4(
                R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.coupon_img11,
                "동네대회","다양한 게임으로 우리 동네 랭킹...",
                "★ 4.5","후기 222",
                "지하철 타고 가면서 시간 보내기 딱 좋은\n게임!",
                "외 219명의 후기"
            )
        )
    }

    fun addItem(item : AroundProductData4) {
        val list = _aroundValue4.value ?: mutableListOf()
        list.add(item)
        _aroundValue4.value = list
    }

}