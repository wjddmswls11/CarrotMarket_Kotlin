package com.example.carrotmarket_kotlin.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R

class HomeActivity : AppCompatActivity() {
    lateinit var datas : HomeProductData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        datas = intent.getSerializableExtra("data") as HomeProductData





    }
}