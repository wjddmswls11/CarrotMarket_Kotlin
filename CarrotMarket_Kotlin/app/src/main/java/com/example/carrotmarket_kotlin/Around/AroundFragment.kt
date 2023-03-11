package com.example.carrotmarket_kotlin.Around

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.FragmentAroundBinding

class AroundFragment : Fragment() {

    lateinit var fBinding: FragmentAroundBinding
    lateinit var aroundList: ArrayList<AroundProductData>
    lateinit var aroundList2 : ArrayList<AroundProductData2>
    lateinit var aroundList3 : ArrayList<AroundProductData3>
    lateinit var aroundList4 : ArrayList<AroundProductData4>
    lateinit var aroundList5 : ArrayList<AroundProductData5>

    lateinit var adapter: AroundAdapter
    lateinit var adapter2: AroundAdapter2
    lateinit var adapter3: AroundAdapter3
    lateinit var adapter4: AroundAdapter4
    lateinit var adapter5: AroundAdapter5

    lateinit var manager: RecyclerView.LayoutManager
    lateinit var manager2: RecyclerView.LayoutManager
    lateinit var manager3: RecyclerView.LayoutManager
    lateinit var manager4: RecyclerView.LayoutManager
    lateinit var manager5: RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentAroundBinding.inflate(inflater, container, false)
        aroundList = ArrayList<AroundProductData>().apply {
            add(
                AroundProductData(
                    R.drawable.around_car, "중고차 직거래"
                )
            )
            add(
                AroundProductData(
                    R.drawable.around_uniform, "알바")
            )
            add(
                AroundProductData(
                    R.drawable.around_home, "부동산 직거래")
            )
            add(
                AroundProductData(
                    R.drawable.around_square, "당근미니")
            )
            add(
                AroundProductData(
                    R.drawable.around_apple, "농수산물")
            )
            add(
                AroundProductData(
                    R.drawable.around_coupon, "쿠폰북"
                )
            )
            add(
                AroundProductData(
                    R.drawable.around_book, "과외/클래스"
                )
            )
            add(
                AroundProductData(
                    R.drawable.around_place, "당근지도"
                )
            )
        }

        aroundList2 = ArrayList<AroundProductData2>().apply {
            add(
                AroundProductData2(
                    R.drawable.store1_1,R.drawable.store1_2,"곱품격",
                    "100% 한우 소곱창,소대창,소막창과 함께...","3.5km","후기 2",
                    "단골 21","좋은데이",
                    "여기 완전 맛났었는데!직원분들이 다 구워주셔서 엄청 편하고 좋았어..."))
            add(
                AroundProductData2(
                    R.drawable.store2_1,R.drawable.store2_2,"미소정육식당",
                    "20년이상 직접도축,판매하여 유통마진을 ...","4.1km","후기 13",
                    "단골 60","장사꾼",
                    "한우 너무 맛있고 직원 분들도 너무 친절하세요 계속 불조절도 해주시고..."
                )
            )
            add(
                AroundProductData2(
                    R.drawable.store3_1,R.drawable.store3_2,"철수와영수전문학원",
                    "안녕하세요^^ 철수와 영수전문학원입니다....","4.4km","후기 4",
                    "단골 9","파라파라킹",
                    "아이들은 즐거워하고, 부모인 어른들은 아이들 학업에 만족스러운... ..."
                )
            )
            add(
                AroundProductData2(
                R.drawable.store4_1,R.drawable.store4_2,"바른보쌈1990 수완점",
                "수비드공법으로 촉촉한 보쌈 족발 맛과 푸...","5.3km","후기 4",
                "단골 26","승승",
                "오픈해서 주문해 봤어요~된장국 색깔이 돈까스 소스가 오는줄 알았네요.맛은 있어요~")
            )

        }

        aroundList3 = ArrayList<AroundProductData3>().apply {
            add(
                AroundProductData3(
                    R.drawable.coupon1,R.drawable.coupon_img11,R.drawable.dsffa,
                    R.drawable.activitycoupon,"뷰티라운지",
                    "4.4km","첫방문속눈썹펌 - 1만원...",
                    "외 32명이 받았어요","쩌저어",
                    "하 저 여기 너무너무너무 좋아"
                )
            )
            add(
                AroundProductData3(
                    R.drawable.coupon2,R.drawable.profile_round_person,R.drawable.dsffa,
                    R.drawable.activitycoupon,"창고형 아이스크림...",
                    "4.9km","최저가 쿠폰",
                    "외 79명이 받았어요","히수",
                    "아주 저렴하게 아이스크림 구매"
                )
            )
            add(
                AroundProductData3(
                    R.drawable.coupon3,R.drawable.coupon_img22,R.drawable.dsffa,
                    R.drawable.activitycoupon,"세라 & 미스페 세정...",
                    "3.8km","추가10% 최대10000할인",
                    "외 82명이 받았어요","하이냥",
                    "너무 이쁜실발 가져갈수 있어서"
                )
            )
            add(
                AroundProductData3(
                    R.drawable.coupon4,R.drawable.profile_round_person,R.drawable.dsffa,
                    R.drawable.activitycoupon,"포엠안경아울렛",
                    "1.4km","대형안경닦이+안경드라....",
                    "외 9명이 받았어요","흰둥곰돌맘",
                    "부모님 다초점렌즈 해드렸는데"
                )
            )
        }

        aroundList4 = ArrayList<AroundProductData4>().apply {
            add(
                AroundProductData4(
                    R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.profile_round_person,
                    "청소연구소","청소를 바꿉니다. 생활을 바꿉니...",
                    "★ 3.9","후기 121",
                    "너무 좋았어요! 화장실이랑 주방이 정말\n만족스러웠어요!저는 재택근무 하느...",
                    "외 118명의 후기"
                )
            )
            add(
                AroundProductData4(
                    R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.coupon_img22,
                    "포스텔러","매일 400만명이 확인하고 힘을 얻...",
                    "★ 3.8","후기 185",
                    "중독성 있어서 하루에 한번씩 보네요^^\n감사합니다",
                    "외 182명의 후기"
                )
            )
            add(
                AroundProductData4(
                    R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.profile_round_person,
                    "GS 마감할인판매","GS 마감할인상품이 당근마켓에...",
                    "★ 4.4","후기 719",
                    "편리하고 좋아요ㅎ 시간 예약과 결제까\n지 미리하고 가니까 원하는시간 쓱 찾...",
                    "외 716명의 후기"
                )
            )
            add(
                AroundProductData4(
                    R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48, R.drawable.coupon_img11,
                    "동네대회","다양한 게임으로 우리 동네 랭킹...",
                    "★ 4.5","후기 222",
                    "지하철 타고 가면서 시간 보내기 딱 좋은\n게임!",
                    "외 219명의 후기"
                )
            )
        }

        aroundList5 = ArrayList<AroundProductData5>().apply {
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "용진농원","3.1km","단감",
                    "16%","25,000원","20"));
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "러닝케어 금...","2.8km","2022 8월 대성더프리\n미엄모의고사",
                    "","15,000원","5"));
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "블루힐즈도자기","3km","도자기원데이클래스",
                    "","50,000원","132"));
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "All바른체형...","3.5km","스포츠마사지 1시간 1\n회권",
                    "","60,000원","160"));
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "나리케이크","3.4km","나리케이크",
                    "","25,000원","114"));
            add(
                AroundProductData5(
                    R.drawable.home_item1_1, R.drawable.ic_favorite_fill0_wght400_grad0_opsz48,
                    "용진농원","3.1km","용진농원",
                    "12%","35,000원","7"));
        }

        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        adapter = AroundAdapter(aroundList)
        adapter2 = AroundAdapter2(aroundList2)
        adapter3 = AroundAdapter3(aroundList3)
        adapter4 = AroundAdapter4(aroundList4)
        adapter5 = AroundAdapter5(aroundList5)

        manager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        manager2 = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        manager3 = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        manager4 = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        manager5 = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        fBinding.aroundRecv1.adapter = adapter
        fBinding.aroundRecv2.adapter = adapter2
        fBinding.aroundRecv3.adapter = adapter3
        fBinding.aroundRecv4.adapter = adapter4
        fBinding.aroundRecv5.adapter = adapter5

        fBinding.aroundRecv1.layoutManager = manager
        fBinding.aroundRecv2.layoutManager = manager2
        fBinding.aroundRecv3.layoutManager = manager3
        fBinding.aroundRecv4.layoutManager = manager4
        fBinding.aroundRecv5.layoutManager = manager5
    }


}


