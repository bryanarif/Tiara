package com.example.sitiara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DeteksiSadanis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deteksi_sadanis)

        val textView = findViewById<TextView>(R.id.sadanis)

        textView.setText("2. Apa itu SADANIS?\n" +
                "Pemeriksaan payudara klinis yang dilakukan oleh tenaga kesehatan yang terlatih.  " +
                "Sadanis Dilakukan sebelum dilakukan Pemeriksaan IVA Tes. \n" +
                "\n" +
                "Kapan dilakukan pemeriksaan SADANIS?\n" +
                "Pemeriksaan SADANIS dilakukan bersamaan dengan IVA Tes jika ditermukan adanya kelainan, " +
                "dilakukan pemeriksaan 1 tahun sekali, namun jika tidak ditemukan dapat dilakukan 5 tahun sekali.\n")
    }
}