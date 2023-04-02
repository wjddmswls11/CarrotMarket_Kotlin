package com.example.carrotmarket_kotlin.Around

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class AroundViewModel1 : ViewModel(){

    private val _aroundValue = MutableLiveData<MutableList<AroundProductData>>()
    val aroundValue : LiveData<MutableList<AroundProductData>> = _aroundValue

    init {
        // 초기값 할당
        _aroundValue.value = mutableListOf(
            AroundProductData(
                R.drawable.around_car, "중고차 직거래"
            ),
            AroundProductData(
                R.drawable.around_uniform, "알바"
            ),
            AroundProductData(
                R.drawable.around_home, "부동산 직거래"
           ),
           AroundProductData(
               R.drawable.around_square, "당근미니"
            ),
            AroundProductData(
                R.drawable.around_apple, "농수산물"
            ),
            AroundProductData(
                R.drawable.around_coupon, "쿠폰북"
            ),
            AroundProductData(
                R.drawable.around_book, "과외/클래스"
            ),
            AroundProductData(
                R.drawable.around_place, "당근지도"
            )
        )
    }

    fun addItem(item : AroundProductData) {
        val list = _aroundValue.value ?: mutableListOf()
        list.add(item)
        _aroundValue.value = list
    }

}