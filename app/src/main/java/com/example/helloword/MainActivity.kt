package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowName.setOnClickListener{ checkValue() }

    }

    fun checkValue (){
        if(binding.etName.text.isNotEmpty()){

        }else {
            showErrorName();
        }
    }

    private fun showErrorName() {
        Toast.makeText(this, "El nombre de usuario no puede ser vacio!", Toast.LENGTH_SHORT).show()
    }
}