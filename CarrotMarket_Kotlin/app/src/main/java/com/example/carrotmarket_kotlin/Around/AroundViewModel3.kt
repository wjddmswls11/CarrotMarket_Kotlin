package com.example.carrotmarket_kotlin.Around

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class AroundViewModel3 : ViewModel(){

    private val _aroundValue3 = MutableLiveData<MutableList<AroundProductData3>>()
    val aroundValue3 : LiveData<MutableList<AroundProductData3>> = _aroundValue3

    init {
        // 초기값 할당
        _aroundValue3.value = mutableListOf(
            AroundProductData3(
                R.drawable.coupon1, R.drawable.coupon_img11, R.drawable.dsffa,
                R.drawable.activitycoupon,"뷰티라운지",
                "4.4km","첫방문속눈썹펌 - 1만원...",
                "외 32명이 받았어요","쩌저어",
                "하 저 여기 너무너무너무 좋아"
            ),
            AroundProductData3(
                R.drawable.coupon2,R.drawable.profile_round_person,R.drawable.dsffa,
                R.drawable.activitycoupon,"창고형 아이스크림...",
                "4.9km","최저가 쿠폰",
                "외 79명이 받았어요","히수",
                "아주 저렴하게 아이스크림 구매"
            ),
            AroundProductData3(
                R.drawable.coupon3,R.drawable.coupon_img22,R.drawable.dsffa,
                R.drawable.activitycoupon,"세라 & 미스페 세정...",
                "3.8km","추가10% 최대10000할인",
                "외 82명이 받았어요","하이냥",
                "너무 이쁜실발 가져갈수 있어서"
            ),
            AroundProductData3(
                R.drawable.coupon4,R.drawable.profile_round_person,R.drawable.dsffa,
                R.drawable.activitycoupon,"포엠안경아울렛",
                "1.4km","대형안경닦이+안경드라....",
                "외 9명이 받았어요","흰둥곰돌맘",
                "부모님 다초점렌즈 해드렸는데"
            )
        )
    }

    fun addItem(item : AroundProductData3) {
        val list = _aroundValue3.value ?: mutableListOf()
        list.add(item)
        _aroundValue3.value = list
    }

}