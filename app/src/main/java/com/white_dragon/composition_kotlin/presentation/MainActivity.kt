package com.white_dragon.composition_kotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.white_dragon.composition_kotlin.R
import com.white_dragon.composition_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}