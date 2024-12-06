package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.Input)
        val button1 = findViewById<Button>(R.id.Button1)
        val result = findViewById<TextView>(R.id.Result)
        val characterCount = findViewById<TextView>(R.id.CharacterCount)

        button1.setOnClickListener {
            val inputText = input.text.toString()

            val reversedText = inputText.reversed()
            result.text = "Результат: $reversedText"

            val charCount = inputText.replace(" ", "").length
            characterCount.text = "Количество символов: $charCount"
        }
    }
}