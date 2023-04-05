package com.example.sitiara.serius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerSeriusPenyebab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius_penyebab)
        val textView = findViewById<TextView>(R.id.penyebab)

        textView.setText("2.\tApa Penyebab Kanker serviks?\n" +
                "-\tTerinfeksi virus HPV (Human Papiloma Virus)\n")
    }
}