package com.example.sitiara.payudara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerPayudaraGejala : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara_gejala)

        val textView = findViewById<TextView>(R.id.gejala1)

        textView.setText("4. Apa gejala dari kanker payudara?\n" +
                "-\tBenjolan atau pengerasan pada payudara yang berbeda dari jaringan sekitar\n" +
                "-\tDarah keluar dari putting payudara\n" +
                "-\tNyeri dan pembengkakan pada payudara\n" +
                "-\tKemerahan atau pembesaran pori pori kulit payudara yang menyerupai kulit jeruk\n" +
                "-\tPengelupasan pada kulit disekitar puting payudara\n" +
                "-\tPerubahan kulit payudara seperti cekungan\n" +
                "-\tPerubahan Ukuran, bentuk, atau tampilan dari payudara\n" +
                "-\tPuting tertarik masuk (retraksi atau inversi) ke dalam\n" +
                "-\tBenjolan atau pembengkakan di bawah ketiak\n")
    }
}