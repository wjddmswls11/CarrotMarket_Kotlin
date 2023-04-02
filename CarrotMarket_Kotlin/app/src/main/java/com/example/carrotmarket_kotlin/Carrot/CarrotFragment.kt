package com.example.carrotmarket_kotlin.Carrot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import com.example.carrotmarket_kotlin.R

class CarrotFragment : Fragment() {

    lateinit var viewModel : CarrotFragmentViewModel
    lateinit var carrotViewModelPlusTextView : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_carrot, container, false)
        carrotViewModelPlusTextView = rootView.findViewById(R.id.carrot_viewModel_plus)

        viewModel = ViewModelProvider(this).get(CarrotFragmentViewModel::class.java)
        viewModel.height.observe(viewLifecycleOwner, { height ->
            carrotViewModelPlusTextView.text = height.toString()
        })

        val increaseButton = rootView.findViewById<Button>(R.id.button_increase)
        increaseButton.setOnClickListener {
            viewModel.increase()
        }

        return rootView
    }
}