package com.example.sitiara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DeteksiSadari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deteksi_sadari)

        val textView = findViewById<TextView>(R.id.sadari)

        textView.setText("3.Apa itu SADARI?\n" +
                "SADARI merupakan pemeiksaan payudara yang dilakukan oleh diri sendiri. " +
                "Mengamati dan memperhatikan apakah ada kelainan dari payudara pada diri sendiri.\n" +
                "\n" +
                "Kapan dilakuakn pemeriksaan SADARI?\n" +
                "-\tWanita yang masih Haid : 7-10 hari hari setelah hari pertama haid\n" +
                "-\tWanita yang tidak Haid (Wanita menggunakan alat KB atau Menopause) setiap bulannya pada tanggal yang sama\n")
    }
}