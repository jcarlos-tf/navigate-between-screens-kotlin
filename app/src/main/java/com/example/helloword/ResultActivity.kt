package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloword.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { onBackPressed() }
        getAddShowName()
    }

    fun getAddShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        binding.tvGreeting.text = "Bienvenido $name"
    }

}