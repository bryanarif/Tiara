package com.example.sitiara.payudara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerPayudaraItu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara_itu)

        val textView = findViewById<TextView>(R.id.itu1)

        textView.setText("1. Apa itu Kanker Payudara? \n\n" +
                "Kanker payudara merupakan suatu jenis tumor ganas yang berkembang pada sel sel payudara. " +
                "Kanker ini tumbuh jika terjadi pertumbuhan yang abnormal dari sel sel pada payudara. " +
                "Sel sel tersebut membelah diri lebih cepat dari sel normal dan berakumulasi, " +
                "yang kemudian membentuk benjolan atau massa.\n")
    }
}