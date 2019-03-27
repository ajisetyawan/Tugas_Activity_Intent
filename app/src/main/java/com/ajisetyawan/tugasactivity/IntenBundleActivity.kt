package com.ajisetyawan.tugasactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inten_bundle.*

class IntenBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inten_bundle)
        val nama = intent.getStringExtra("Nama")
        val npm = intent.getStringExtra("NPM")
        val kelas = intent.getStringExtra("Kelas")
        val kampus = intent.getStringExtra("Kampus")
        val foto = intent.getStringExtra("Foto")
        tvNamaku.text = nama
        tvNpmku.text = npm
        tvKelasku.text = kelas
        tvKampusku.text = kampus
    }
}
