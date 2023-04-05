package com.example.sitiara.payudara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerPayudaraPenyebab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara_penyebab)
        val textView = findViewById<TextView>(R.id.penyebab1)

        textView.setText("2. Apa penyebab dari kanker payudara?\n" +
                "-\tMerokok dan terpapar asap rokok\n" +
                "-\tPola makan yang buruk\n" +
                "-\tHaid pertama pada umur kurang dari 12 tahun\n" +
                "-\tMenopause setelah usia 50 tahun\n" +
                "-\tMelahirkan anak pertama setelah 35 Tahun\n" +
                "-\tTidak pernah menyusui anak\n" +
                "-\tPertumbuhan abnormal dari sel pada payudara\n" +
                "-\tGen BRCA 1 dan gen BRACA 2 yang bermutasi \n")
    }
}