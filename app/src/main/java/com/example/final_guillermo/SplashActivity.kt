package com.example.final_guillermo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.final_guillermo.databinding.ActivityLoginBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}