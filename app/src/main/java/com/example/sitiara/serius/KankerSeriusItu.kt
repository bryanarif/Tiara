package com.example.sitiara.serius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R


class KankerSeriusItu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius_itu)

        val textViewe = findViewById<TextView>(R.id.itu)

        textViewe.setText("1.\tApa itu Kanker Serviks?\n" +
                "Kanker Serviks (leher rahim) merupakan penyakit tumor ganas di leher rahim yang dapat menyebar " +
                "(metastasis) ke organ-organ yang lain dan menyebabkan kematian.\n")
    }
}