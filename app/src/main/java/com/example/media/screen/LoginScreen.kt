package com.example.media.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.example.media.R
import com.example.media.databinding.ActivityLoginScreeenBinding

class LoginScreen : AppCompatActivity() {
    private lateinit var binding: ActivityLoginScreeenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreeenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}