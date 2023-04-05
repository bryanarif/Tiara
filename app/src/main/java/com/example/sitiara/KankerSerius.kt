package com.example.sitiara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sitiara.serius.*

class KankerSerius : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius)

        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            val intent = Intent(this, KankerSeriusItu::class.java)
            startActivity(intent)
        }
        val Button3 = findViewById<Button>(R.id.button3)
        Button3.setOnClickListener {
            val intent = Intent(this, KankerSeriusPenyebab::class.java)
            startActivity(intent)
        }
        val Button4 = findViewById<Button>(R.id.button4)
        Button4.setOnClickListener {
            val intent = Intent(this, KankerSeriusResiko::class.java)
            startActivity(intent)
        }
        val Button5 = findViewById<Button>(R.id.button5)
        Button5.setOnClickListener {
            val intent = Intent(this, KankerSeriusGejala::class.java)
            startActivity(intent)
        }
        val Button6 = findViewById<Button>(R.id.button6)
        Button6.setOnClickListener {
            val intent = Intent(this, KankerSeriusCegah::class.java)
            startActivity(intent)
        }
    }
}