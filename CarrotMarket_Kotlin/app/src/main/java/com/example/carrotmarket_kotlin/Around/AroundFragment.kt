package com.example.carrotmarket_kotlin.Around

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.FragmentAroundBinding

class AroundFragment : Fragment() {

    lateinit var fBinding: FragmentAroundBinding
    lateinit var viewModel1: AroundViewModel1
    lateinit var viewModel2: AroundViewModel2
    lateinit var viewModel3: AroundViewModel3
    lateinit var viewModel4: AroundViewModel4
    lateinit var viewModel5: AroundViewModel5

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
        viewModel1 = ViewModelProvider(this).get(AroundViewModel1::class.java)
        viewModel2 = ViewModelProvider(this).get(AroundViewModel2::class.java)
        viewModel3 = ViewModelProvider(this).get(AroundViewModel3::class.java)
        viewModel4 = ViewModelProvider(this).get(AroundViewModel4::class.java)
        viewModel5 = ViewModelProvider(this).get(AroundViewModel5::class.java)

        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        adapter = AroundAdapter(viewModel1.aroundValue.value ?: mutableListOf())
        adapter2 = AroundAdapter2(viewModel2.aroundValue2.value ?: mutableListOf())
        adapter3 = AroundAdapter3(viewModel3.aroundValue3.value ?: mutableListOf())
        adapter4 = AroundAdapter4(viewModel4.aroundValue4.value ?: mutableListOf())
        adapter5 = AroundAdapter5(viewModel5.aroundValue5.value ?: mutableListOf())

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


