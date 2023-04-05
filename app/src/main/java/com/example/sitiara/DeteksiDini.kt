package com.example.sitiara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sitiara.payudara.KankerPayudaraItu
import com.example.sitiara.payudara.KankerPayudaraPenyebab
import com.example.sitiara.payudara.KankerPayudaraResiko

class DeteksiDini : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deteksi_dini)

        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            val intent = Intent(this, DeteksiIVa::class.java)
            startActivity(intent)
        }
        val Button3 = findViewById<Button>(R.id.button3)
        Button3.setOnClickListener {
            val intent = Intent(this, DeteksiSadanis::class.java)
            startActivity(intent)
        }
        val Button4 = findViewById<Button>(R.id.button4)
        Button4.setOnClickListener {
            val intent = Intent(this, DeteksiSadari::class.java)
            startActivity(intent)
        }

    }
}