package com.example.sitiara.serius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sitiara.R

class KankerSeriusCegah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanker_serius_cegah)

        val textView = findViewById<TextView>(R.id.cegah)

        textView.setText("5.\tBagaimana cara mencegah kanker serviks?\n" +
                "-\tLakukan vaksinasi HPV\n" +
                "-\tLakukan deteksi dini dengan Papsmear atau IVA\n" +
                "-\tHindari seks bebas\n")
    }
}