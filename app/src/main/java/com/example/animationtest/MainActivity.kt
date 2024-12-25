package com.example.animationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShow.setOnClickListener(){
            //binding.imgView.animate().alpha(1f).duration = 5000
            //binding.imgView.animate().rotation(180f).duration = 5000
            //binding.imgView.animate().translationX(-350f).duration = 5000
            binding.imgView.animate().scaleX(2f).duration = 5000
            binding.imgView.animate().scaleY(2f).duration = 5000

        }
    }
}