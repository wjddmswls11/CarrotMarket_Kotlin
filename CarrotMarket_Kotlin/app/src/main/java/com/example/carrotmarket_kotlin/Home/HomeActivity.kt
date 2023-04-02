package com.example.carrotmarket_kotlin.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var aBinding : ActivityHomeBinding
    lateinit var intentFromHome: HomeProductData

    private lateinit var homeVIewModel: HomeVIewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(aBinding.root)

        val home_intent_favorite = findViewById<ImageView>(R.id.home_intent_favorite)
        homeVIewModel = ViewModelProvider(this).get(HomeVIewModel::class.java)

        intentFromHome = intent.getSerializableExtra("fromHome") as HomeProductData
        Log.d("TAG", "onCreate: $intentFromHome")

        Glide.with(this).apply {
            load(intentFromHome.img_home).into(aBinding.homeIntentimg1)
            load(intentFromHome.img_home2).into(aBinding.homeIntentimg2)
            load(intentFromHome.img_home3).into(aBinding.homeIntentimg3)
            load(intentFromHome.img_home4).into(aBinding.homeIntentimg4)
            load(intentFromHome.profile_image).into(aBinding.profileImage)
        }

        aBinding.apply {
            homeIntenttitle.text = intentFromHome.tv_home1
            homeIntenttxt2.text = intentFromHome.tv_home2
            homeIntentTime.text = intentFromHome.tv_home3
            homeIntentFavor.text = intentFromHome.tv_home_favorite

            homeIntenttxt1.text = intentFromHome.home_intenttxt1
            homeIntentType.text = intentFromHome.home_intent_type
            homeIntentContents.text = intentFromHome.home_intent_contents
            homeIntentLook.text = intentFromHome.home_intent_look
        }


        home_intent_favorite.setOnClickListener{
            homeVIewModel.HomeValue.value
        }




    }
}