package com.example.carrotmarket_kotlin.Home

import android.widget.ImageView
import java.io.Serializable

data class HomeProductData(
    val img_home: Int, val img_home_chat: Int, val img_home_favorite: Int, val img_home2: Int,
    val img_home3: Int, val img_home4: Int, val profile_image: Int,
    val tv_home1: String, val tv_home2: String, val tv_home3: String,
    val tv_home4: String, val tv_home_chat: String,
    val tv_home_favorite: String, val home_intenttxt1: String,
    val home_intent_type: String, val home_intent_contents: String,
    val home_intent_look: String
): Serializable


