package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun clickMe(view : View){
        var textName : String = binding.editTextText.text.toString()
        var textEmail : String = binding.editTextText2.text.toString()

        binding.textView2.setText("Your Name is : " + textName +"\n" + "Your Email is : "+ textEmail)

    }

    override fun onPause() {
        super.onPause()
        binding.editTextText.setText("")
        binding.editTextText2.setText("")
    }

}