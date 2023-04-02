package com.example.carrotmarket_kotlin.Around

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class AroundViewModel5 : ViewModel() {

    private val _aroundValue5 = MutableLiveData<MutableList<AroundProductData5>>()
    val aroundValue5: LiveData<MutableList<AroundProductData5>> = _aroundValue5

    init {
        // 초기값 할당
        _aroundValue5.value = mutableListOf(
            AroundProductData5(
                R.drawable.around_apple, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "용진농원", "3.1km", "단감",
                "16%", "25,000원", "20"
            ),
            AroundProductData5(
                R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "러닝케어 금...","2.8km","2022 8월 대성더프리\n미엄모의고사",
                "","15,000원","5"
            ),
            AroundProductData5(
                R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "블루힐즈도자기","3km","도자기원데이클래스",
                "","50,000원","132"
            ),
            AroundProductData5(
                R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "All바른체형...","3.5km","스포츠마사지 1시간 1\n회권",
                "","60,000원","160"
            ),
            AroundProductData5(
                R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "나리케이크","3.4km","나리케이크",
                "","25,000원","114"
            ),
            AroundProductData5(
                R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                "용진농원","3.1km","용진농원",
                "12%","35,000원","7"
            )
        )
    }

    fun addItem(item : AroundProductData5) {
        val list = _aroundValue5.value ?: mutableListOf()
        list.add(item)
        _aroundValue5.value = list
    }

}