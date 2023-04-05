package com.example.sitiara

import android.content.Intent
import android.icu.text.IDNA.Info
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the status bar.
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//// Remember that you should never show the action bar if the
//// status bar is hidden, so hide that too if necessary.
//        actionBar?.hide()


        val CardView = findViewById<CardView>(R.id.cvAbsenMasuk)
        CardView.setOnClickListener {
            val intent = Intent(this, KankerSerius::class.java)
            startActivity(intent)
        }

        val CardView1 = findViewById<CardView>(R.id.cvAbsenKeluar)
        CardView1.setOnClickListener {
            val intent = Intent(this, KankerPayudara::class.java)
            startActivity(intent)
        }

        val CardView2 = findViewById<CardView>(R.id.cvPerizinan)
        CardView2.setOnClickListener {
            val intent = Intent(this, DeteksiDini::class.java)
            startActivity(intent)
        }
        val CardView3 = findViewById<CardView>(R.id.cvInfo)
        CardView3.setOnClickListener {
            val intent = Intent(this, MainInfo::class.java)
            startActivity(intent)
        }

//        cvAb.setOnClickListener {
//            strTitle = "Absen Masuk"
//            val intent = Intent(this@MainActivity, KankerSerius::class.java)
//            intent.putExtra(AbsenActivity.DATA_TITLE, strTitle)
//            startActivity(intent)
//        }
//
//        cvAbsenKeluar.setOnClickListener {
//            strTitle = "Absen Keluar"
//            val intent = Intent(this@MainActivity, KankerSerius::class.java)
//            intent.putExtra(AbsenActivity.DATA_TITLE, strTitle)
//            startActivity(intent)
//        }
//
//        cvPerizinan.setOnClickListener {
//            strTitle = "Izin"
//            val intent = Intent(this@MainActivity, DeteksiDini::class.java)
//            intent.putExtra(AbsenActivity.DATA_TITLE, strTitle)
//            startActivity(intent)
//        }
    }
}