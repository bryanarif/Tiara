package com.example.sitiara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sitiara.payudara.*

class KankerPayudara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara)

        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            val intent = Intent(this, KankerPayudaraItu::class.java)
            startActivity(intent)
        }
        val Button3 = findViewById<Button>(R.id.button3)
        Button3.setOnClickListener {
            val intent = Intent(this, KankerPayudaraPenyebab::class.java)
            startActivity(intent)
        }
        val Button4 = findViewById<Button>(R.id.button4)
        Button4.setOnClickListener {
            val intent = Intent(this, KankerPayudaraResiko::class.java)
            startActivity(intent)
        }
        val Button5 = findViewById<Button>(R.id.button5)
        Button5.setOnClickListener {
            val intent = Intent(this, KankerPayudaraGejala::class.java)
            startActivity(intent)
        }
        val Button6 = findViewById<Button>(R.id.button6)
        Button6.setOnClickListener {
            val intent = Intent(this, KankerPayudaraCegah::class.java)
            startActivity(intent)
        }
    }
}