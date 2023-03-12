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
//        townList = ArrayList<TownProductData>().apply {
//        }
        Log.d("TAG", "onCreateView: $townList")

        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        setRecyclerView()
    }

    private fun setRecyclerView() {
        adapter = TownAdapter(townList)
        manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        fBinding.Town001MainProductRecyclerView.adapter = adapter
        fBinding.Town001MainProductRecyclerView.layoutManager = manager
    }



}