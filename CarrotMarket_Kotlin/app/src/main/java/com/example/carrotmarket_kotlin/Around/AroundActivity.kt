package com.example.carrotmarket_kotlin.Around

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.carrotmarket_kotlin.R
import com.example.carrotmarket_kotlin.databinding.ActivityAroundBinding

class AroundActivity : AppCompatActivity() {

    val aBinding by lazy { ActivityAroundBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_around)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))






    }
}