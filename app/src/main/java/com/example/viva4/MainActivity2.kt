package com.example.viva4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        btn1.setOnClickListener {
            Intent(applicationContext,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
        btn2.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }

        btn3.setOnClickListener {
            Intent(Intent.ACTION_PICK).setType("image/*").apply {
                startActivity(this)
            }
        }

    }
}