package com.example.sitiara.payudara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerPayudaraCegah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_payudara_cegah)
        val textView = findViewById<TextView>(R.id.cegah1)

        textView.setText("5. Bagaimana pencegahan dari kanker payudara?\n" +
                "-\tBerolahraga secara rutin\n" +
                "-\tIstirahat cukup\n" +
                "-\tMenyusui anak hingga berusia 2 tahun\n" +
                "-\tPemeriksaan rutin dengan SADARI atau sadarnis\n" +
                "-\tPengelolaan Stress yang baik\n" +
                "-\tPola makan gizi seimbang\n" +
                "-\tTidak merokok\n" +
                "-\tTidak mengkonsumsi alkohol\n")
    }
}