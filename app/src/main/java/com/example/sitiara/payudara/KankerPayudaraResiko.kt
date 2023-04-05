package com.example.sitiara.payudara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerPayudaraResiko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara_resiko)

        val textView = findViewById<TextView>(R.id.resiko1)

        textView.setText("3. Apa Faktor risiko dari Kanker payudara?\n" +
                "-\tWanita\n" +
                "-\tMerokok\n" +
                "-\tKelebihan berat badan atau obesitas\n" +
                "-\tMengkonsumsi alkohol\n" +
                "-\tBelum pernah hamil\n" +
                "-\tRiwayat kanker payudara pada nenek. Ibu, tante, adik, kakak, atau anak sekandung\n" +
                "-\tRiwayat kanker payudara pada diri sendiri pada salah satu payudara\n" +
                "-\tPernah terpapar dengan radiasi\n" +
                "-\tUsia diatas 50 tahun\n" +
                "-\tMulai menopause pada usia yang lebih tua\n" +
                "-\tMenstruasi sebelum 12 tahun\n")
    }
}