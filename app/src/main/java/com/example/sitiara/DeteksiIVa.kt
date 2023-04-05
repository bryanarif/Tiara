package com.example.sitiara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DeteksiIVa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deteksi_iva)

        val textView = findViewById<TextView>(R.id.iva)

        textView.setText("1. IVA Tes\n" +
                "Apa itu IVA Tes?\n" +
                "IVA Tes (Inspeksi Vagina dengan Asam asetat) yaitu pemeriksaan yang mengoleskan larutan asam cuka (asam asetat 3-5%) dan larutan iodium lugol pada serviks. Pemeriksaan ini melihat apakah terdapat perubahan warna yang terjadi setelah mengoleskan  larutan tersebut pada serviks dalam waktu 1 menit. Untuk melakukan tes ini, Anda dapat mengunjungi rumah sakit, klinik, atau puskesmas.\n" +
                "\n" +
                "Jaringan serviks yang sehat tidak akan mengalami perubahan warna setelah dioleskan asam asetat. Namun, jika terdapat sel abnormal pada serviks, akan muncul bercak putih pada permukaan mulut rahim.. Hal ini dapat menandakan adanya kecurigaan sel tumor atau sel kanker pada serviks.\n" +
                "\n" +
                "Kapan dilakukan pemeriksaan IVA Tes ?\n" +
                "1. Skrining pada setiap wanita minimal satu kali pada usia 35-40 tahun, jika fasilitas memungkinkan lakukan setiap sepuluh tahun pada usia 35-55 tahun, namun jika fasilitas tersedia lebih lakukan lima tahun pada usia 35-55 tahun. \n" +
                "\n" +
                "2. Ideal dan optimal pemeriksaan dilakukan setiap tiga tahun pada wanita usia 25-60 tahun.\n" +
                "\n" +
                "3. Skrining yang dilakukan sekali dalam sepuluh tahun atau sekali seumur hidup memiliki dampak yang signifikan. Di Indonesia anjuran untuk melakukan pemeriksaan IVA bila hasil positif (+) adalah satu tahun dan apabila hasil negative (-) adalah lima tahun. \n" +
                " \n" +
                "\n" +
                "Apa saja syarat pemeriksaan IVA Tes?\n" +
                "1. Sudah pernah melakukan hubungan seksual \n" +
                "2. Tidak sedang datang bulan/haid \n" +
                "3. Tidak sedang hamil \n" +
                "4. 24 jam sebelumnya tidak melakukan hubungan seksual\n")
    }
}