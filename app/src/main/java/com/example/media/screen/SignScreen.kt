package com.example.media.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.media.R
import com.example.media.databinding.ActivitySignScreenBinding

class SignScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}