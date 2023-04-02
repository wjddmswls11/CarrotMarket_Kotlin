package com.example.carrotmarket_kotlin.Home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carrotmarket_kotlin.R

class HomeVIewModel : ViewModel() {

    private val _HomeValue = MutableLiveData<MutableList<HomeProductData>>()
    val HomeValue: LiveData<MutableList<HomeProductData>> = _HomeValue

    init {
        _HomeValue.value = mutableListOf(
            HomeProductData(
                R.drawable.home_item1_1, R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48, R.drawable.home_item1_2,
                0, 0, R.drawable.profile_round_person,
                "플립 2 팝니다", "광산구 첨단2동", "끌올 그저께",
                "150,000원", "0", "4", "똠부기",
                "디지털기기",
                "이번에 액정교체 하였답니다\n깨끗하고 잔 기스 없습니다",
                "158"
            ),
            HomeProductData(
                R.drawable.home_item2_1, R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item2_2, 0, 0, R.drawable.intent_member_img1,
                "구글 크롬캐스트 4 스카이 (미개봉 새상품)", "상무1동", "3시간 전",
                "75,000원", "0", "6", "당근토끼",
                "디지털기기", "아이폰,아이패드,안드로이드,맥,윈도우,크롬북에서\n작동 가능한 구글 크롬케스트4입니다\n리모컨 포함입니다", "177"
            ),
            HomeProductData(
                R.drawable.home_item3_1, R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item3_2, 0, 0, R.drawable.profile_round_person,
                "삼성 레이저 프린트", "광산구 흑석동", "끌올 1분 전",
                "60,000원", "1", "2", "엄마입니다",
                "디지털기기", "구입은 4년전\n사용은 1년미만\n검정.잉크교환됨\n칼라만바꿔서사용하세요", "170"
            ),
            HomeProductData(
                R.drawable.home_item4_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                    R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    R.drawable.home_item4_2,R.drawable.home_item4_3,R.drawable.home_item4_4,R.drawable.intent_member_img2,
                    "엘로치오 마누스V2","광산구 첨단2동","끌올 그제께",
                    "900,000원","0","4", "탈레랑",
                    "생활가전","2020년 6월에 구매 했습니다 \n\n 구성품 엘로치오 마누스V2,샤워스크린(일체형방식) 2개. 가스켓 6개,\n템퍼, 마카롱 탬퍼 덴테이션 블랙 58mm, 템퍼받침대, 침칠봉 58mm","87"

            ),
            HomeProductData(
                R.drawable.home_item5_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item5_2,R.drawable.home_item5_3,R.drawable.home_item5_4,R.drawable.profile_round_person,
                "소형 냉장고 팝니다","광산구 우산동","그저께",
                "120,000원","4","4","주옥",
                "디지털기기","사용 거의 안했습니다 옮기시는거 생각해서 싸게 올립니다!","248"
            ),
            HomeProductData(
                R.drawable.home_item6_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item6_2,R.drawable.home_item6_3,R.drawable.home_item6_4,R.drawable.intent_member_img3,
                "원적외선 반신욕 사우나","서구 풍암동","끌올 23분 전",
                "650,000원","0","3", "뚱이",
                "생활가전","작년에110에 구매했습니다\n정상작동되고 사서 5번도 안썻고\n직접 가져가셔야 합니다","169"
            ),
            HomeProductData(
                R.drawable.home_item7_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                0,0,0,R.drawable.profile_round_person,
                "로렉스 요트마스터 42 옐로우","서구 농성1동","끌올 그저께",
                "4100만원","4","5","치평동장사꾼",
                "생활가전","22년 10월 국내 풀셋 네고 ㅈㅅ\n필름까지 같이 드림","847"
            ),
            HomeProductData(
                R.drawable.home_item8_1,R.drawable.ic_forum_fill0_wght400_grad0_opsz48,
                R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                R.drawable.home_item8_2,R.drawable.home_item8_3,R.drawable.home_item8_4,R.drawable.profile_round_person,
                "ps5 플스5 플레이스테이션5 판매합니다","남구 월산동","6시간 전",
                "500,000원","2","3","VV",
                "디지털기기","금일 저녁 거래 가능합니다\n,-오셔서 거래하는 조건입니다.\npPS5 판매합니다.","221"
            )
        )
    }

    fun addItem(item : HomeProductData) {
        val list =_HomeValue.value ?: mutableListOf()
        list.add(item)
        _HomeValue.value = list
    }




}