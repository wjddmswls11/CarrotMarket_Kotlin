package com.example.carrotmarket_kotlin.Around

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class AroundViewModel2 : ViewModel() {

    private val _aroundValue2 = MutableLiveData<MutableList<AroundProductData2>>()
    val aroundValue2: LiveData<MutableList<AroundProductData2>> = _aroundValue2

    init {
        // 초기값 할당
        _aroundValue2.value = mutableListOf(
            AroundProductData2(
                R.drawable.store1_1, R.drawable.store1_2, "곱품격",
                "100% 한우 소곱창,소대창,소막창과 함께...", "3.5km", "후기 2",
                "단골 21", "좋은데이",
                "여기 완전 맛났었는데!직원분들이 다 구워주셔서 엄청 편하고 좋았어..."
            ),
            AroundProductData2(
                R.drawable.store2_1, R.drawable.store2_2, "미소정육식당",
                "20년이상 직접도축,판매하여 유통마진을 ...", "4.1km", "후기 13",
                "단골 60", "장사꾼",
                "한우 너무 맛있고 직원 분들도 너무 친절하세요 계속 불조절도 해주시고..."
            ),
            AroundProductData2(
                R.drawable.store3_1, R.drawable.store3_2, "철수와영수전문학원",
                "안녕하세요^^ 철수와 영수전문학원입니다....", "4.4km", "후기 4",
                "단골 9", "파라파라킹",
                "아이들은 즐거워하고, 부모인 어른들은 아이들 학업에 만족스러운... ..."
            ),
            AroundProductData2(
                R.drawable.store4_1, R.drawable.store4_2, "바른보쌈1990 수완점",
                "수비드공법으로 촉촉한 보쌈 족발 맛과 푸...", "5.3km", "후기 4",
                "단골 26", "승승",
                "오픈해서 주문해 봤어요~된장국 색깔이 돈까스 소스가 오는줄 알았네요.맛은 있어요~"
            )
        )
    }

    fun addItem(item : AroundProductData2) {
        val list = _aroundValue2.value ?: mutableListOf()
        list.add(item)
        _aroundValue2.value = list
    }

}