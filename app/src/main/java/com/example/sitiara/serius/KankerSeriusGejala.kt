package com.example.sitiara.serius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerSeriusGejala : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius_gejala)


        val textView = findViewById<TextView>(R.id.gejala)

        textView.setText("4.\tApa gejala Kanker Serviks?\n" +
                "-\tPerdarahan setelah berhubungan seksual\n" +
                "-\tNyeri pada bagian pinggul setelah berhubungan seksual\n" +
                "-\tPerdarahan diluar siklus menstruasi\n" +
                "-\tPerdarahan setelah menopause\n" +
                "-\tKeluar cairan keputihan yang abnormal (cairan keputihan yang encer / berbau/ mengandung darah)\n")
    }
}