package com.example.sitiara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_info)

        val textView = findViewById<TextView>(R.id.info)
        val textView1 = findViewById<TextView>(R.id.textView)

        textView.setText("Aplikasi ini merupakan Aplikasi yang menjelaskan gambaran secara " +
                "singkat mengenai Kanker Payudara dan Kanker Serviks untuk masyarakat umum. " +
                "Penjelasan dalam aplikasi ini diharapkan dapat meningkatkan kesadaran wanita " +
                "untuk rutin melakukan Tes IVA. Melalui aplikasi ini diharapkan kesadaran dan " +
                "kepedulian masyarakat meningkat, terutama dalam mengendalikan faktor risiko dan " +
                "deteksi dini kanker serviks. Sehingga angka kesakitan, kematian, akibat penyakit " +
                "kanker serviks dapat ditekan.")

        textView1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}