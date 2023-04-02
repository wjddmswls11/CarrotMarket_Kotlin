package com.example.carrotmarket_kotlin.Carrot

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarrotFragmentViewModel : ViewModel() {

    private var _height = MutableLiveData<Int>()


    val height : LiveData<Int>
        get() = _height

    init {
        _height.value = 0
    }

    fun increase() {
        _height.value = _height.value?.plus(1)
    }





}