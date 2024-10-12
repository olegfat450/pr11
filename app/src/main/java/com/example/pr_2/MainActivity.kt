package com.example.pr_2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textViewT: TextView
    private lateinit var button1: Button
    private lateinit var amountChars1: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        textViewT = findViewById(R.id.textT)
        button1 = findViewById(R.id.button1)
        amountChars1 = findViewById(R.id.amountChars)

         // onButtonClick(button1)
    }

    fun onButtonClick(view: View) {

        val string = editText.text
        val s = string.filter { it != ' ' }
        textViewT.text = string.reversed()

        amountChars1.text = "Количество символов: ${s.length}"
    }

}