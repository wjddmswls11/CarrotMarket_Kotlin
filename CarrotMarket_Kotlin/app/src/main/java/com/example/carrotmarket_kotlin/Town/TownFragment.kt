package com.example.carrotmarket_kotlin.Town

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.databinding.FragmentTownBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

class TownFragment : Fragment() {

    private val TAG = "TAG"
    lateinit var fBinding: FragmentTownBinding

    lateinit var adapter: TownAdapter
    lateinit var manager: RecyclerView.LayoutManager
    private var townList: ArrayList<TownProductData> = arrayListOf()

    //    override fun onAttach(context: Context) {
//        super.onAttach(context)
//
//        var jsonString: String = ""
//        try {
//            jsonString = requireActivity().assets.open("townData.json")
//                .bufferedReader()
//                .use { it.readText() }
//
//            val gson = Gson()
//            val townListType = object : TypeToken<List<TownProductData>>() {}.type
//
//            townList = gson.fromJson(jsonString, townListType)
//        } catch (ioException: IOException) {
//            ioException.printStackTrace()
//        }
//
//        Log.d(TAG, "onAttach: $jsonString")
//        Log.d(TAG, "onAttach townList: $townList")
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentTownBinding.inflate(inflater, container, false)
        townList = ArrayList<TownProductData>().apply {
            add(
                TownProductData(
                    "동네질문",
                    "Q",
                    "아파트물청소9시부터해서2시에끝나서요 2시에 물틀어서 30분 40분정도 끝나면 세수와설거지해도상관는없는거예요?",
                    "키리토",
                    "쌍촌동",
                    "16분 전",
                    "답변하기",
                    "궁금해요"
                )
            )
            add(
                TownProductData(
                    "동네질문",
                    "Q",
                    "에어컨 잘 아시는분 에어컨 하나 놓으려고 하는데 히터 대는걸루유\n근대 히터 사용하려면 3상전원 무지껀 들어와야 하나요?",
                    "제롬파월",
                    "서구 내방동",
                    "1시간 전",
                    "답변 6",
                    "궁금해요"
                )
            )
            add(
                TownProductData(
                    "동네질문",
                    "Q",
                    "집에만 있기 심심한데 혼자 또 뭘 배우기엔 오래 못할거같아서 같이\n한능검 (한국사)배우고 싶은데 하실분 계신가요 같은 여자분이면\n좋겠어요ㅠㅠ나이는 상관없어요",
                    "메롱",
                    "금호동",
                    "1시간 전",
                    "답변 3",
                    "궁금해요"
                )
            );
            add(
                TownProductData(
                    "동네질문",
                    "Q",
                    "혹시 금호지구(종원팰리스빌)쪽 쿠팡 배송(새벽배송은 마감됨) 시간대가 어떻게 되나요?? 오전에 받아야되서요~",
                    "진리진리",
                    "서구 화정돔",
                    "1시간 전",
                    "답변 4",
                    "궁금해요"
                )
            );
            add(
                TownProductData(
                    "일상",
                    "",
                    "제주도에서 광주오시는분 있나요? 주말에ㅎ.ㅎ",
                    "문몽실리우스",
                    "금호2동",
                    "2시간 전",
                    "댓글쓰기",
                    "공감하기"
                )
            );
            add(
                TownProductData(
                    "취미생활",
                    "",
                    "캐치볼하실분 계시나요~",
                    "라임레몬오렌지",
                    "쌍촌동",
                    "3시간 전",
                    "댓글쓰기",
                    "공감하기"
                )
            );
            add(
                TownProductData(
                    "해주세요",
                    "",
                    "스크린 100인치 짜리를 샀는데 설치좀도와주실분계신가요...\n염주포스코입니다...",
                    "풍암필라테스",
                    "치평동",
                    "4시간 전",
                    "댓글 6",
                    "공감하기"
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
    adapter = TownAdapter(townList)
    manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    fBinding.Town001MainProductRecyclerView.adapter = adapter
    fBinding.Town001MainProductRecyclerView.layoutManager = manager
}



}