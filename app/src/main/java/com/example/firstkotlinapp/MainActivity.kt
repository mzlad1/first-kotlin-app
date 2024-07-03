package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textEdit1 : EditText
    lateinit var textEdit2 : EditText
    lateinit var textView1 : TextView
    lateinit var textView2 : TextView
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    fun setup(){
        textEdit1 = findViewById(R.id.editTextText)
        textEdit2 = findViewById(R.id.editTextText2)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        button = findViewById(R.id.button)
    }

    fun clickMe(view : View){
        var textName : String = textEdit1.text.toString()
        var textEmail : String = textEdit2.text.toString()

        textView2.setText("Your Name is : " + textName +"\n" + "Your Email is : "+ textEmail)

    }
}