package com.example.carrotmarket_kotlin.Home


import android.app.Activity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.FragmentHomeBinding
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    lateinit var fBinding: FragmentHomeBinding
    lateinit var viewModel: HomeVIewModel

    lateinit var adapter: HomeAdapter
    lateinit var manager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentHomeBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(HomeVIewModel::class.java)

        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }


    private fun setRecyclerView() {
        adapter = HomeAdapter(viewModel.HomeValue.value ?: mutableListOf())
        manager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        fBinding.Home001MainProductRecyclerView.adapter = adapter
        fBinding.Home001MainProductRecyclerView.layoutManager = manager



    }


}