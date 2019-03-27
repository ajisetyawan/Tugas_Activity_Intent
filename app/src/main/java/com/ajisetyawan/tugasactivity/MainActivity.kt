package com.ajisetyawan.tugasactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPindahActivityExplisit.setOnClickListener {
            startActivity(Intent(this, ExplisitIntenActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ImplisitIntenActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent:Intent = Intent(this, IntenBundleActivity::class.java)
            intent.putExtra("Nama", "Ahmad Aji Nursetyawan")
            intent.putExtra("NPM", "16670003")
            intent.putExtra("Kelas", "6A")
            intent.putExtra("Kampus", "Universitas PGRI Semarang")
            intent.putExtra("Foto", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F414612%2Fpexels-photo-414612.jpeg%3Fauto%3Dcompress%26cs%3Dtinysrgb%26dpr%3D1%26w%3D500&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fbeauty%2F&docid=pFs_4Fcq5AgpmM&tbnid=aT1lQMo5nzpYfM%3A&vet=10ahUKEwjM4aDfraLhAhVLb30KHQD1ALIQMwg-KAAwAA..i&w=500&h=355&bih=920&biw=1920&q=image&ved=0ahUKEwjM4aDfraLhAhVLb30KHQD1ALIQMwg-KAAwAA&iact=mrc&uact=8")
            startActivity(intent)
        }
    }
}
