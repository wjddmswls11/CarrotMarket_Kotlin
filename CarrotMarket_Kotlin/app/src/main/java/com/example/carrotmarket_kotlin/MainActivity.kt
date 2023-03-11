package com.example.carrotmarket_kotlin

import android.opengl.GLES31
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.carrotmarket_kotlin.Around.AroundFragment
import com.example.carrotmarket_kotlin.Carrot.CarrotFragment
import com.example.carrotmarket_kotlin.Chat.ChatFragment
import com.example.carrotmarket_kotlin.Home.HomeFragment
import com.example.carrotmarket_kotlin.Town.TownFragment
import com.example.carrotmarket_kotlin.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var aBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(aBinding.root)

        initBottomNavigation()



    }

    //바텀네비초기설정
    private fun initBottomNavigation() {
        replaceFragment(HomeFragment())

        aBinding.mainBtn.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu1 -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.menu2 -> {
                    replaceFragment(TownFragment())
                    true
                }
                R.id.menu3 -> {
                    replaceFragment(AroundFragment())
                    true
                }
                R.id.menu4 -> {
                    replaceFragment(ChatFragment())
                    true
                }
                R.id.menu5 -> {
                    replaceFragment(CarrotFragment())
                    true
                }
                else -> false
            }
        }
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }


}