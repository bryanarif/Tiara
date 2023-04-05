package com.example.sitiara.serius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerSeriusResiko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius_resiko)


        val textView = findViewById<TextView>(R.id.resiko)

        textView.setText("3.\tApa Faktor Risiko Kanker Serviks?\n" +
                "-\tIndividu yang merokok aktif maupun pasif\n" +
                "-\tPenurunan daya tahan tubuh \n" +
                "-\tMemiliki riwayat + Papsmear\n" +
                "-\tTerpapar infeksi yang ditularkan secara seksual\n" +
                "-\tIbu atau kakak menderita kanker serviks\n" +
                "-\tBerhubungan seksual kurang dari usia 20 tahun\n" +
                "-\tBerganti ganti pasangan seksual\n")
    }
}