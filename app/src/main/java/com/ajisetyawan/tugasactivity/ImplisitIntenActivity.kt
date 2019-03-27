package com.ajisetyawan.tugasactivity

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_implisit_inten.*
import java.io.File

class ImplisitIntenActivity : AppCompatActivity() {
    private val TAKE_PICTURE = 1
    private val imageUri: Uri? = null
    val REQUEST_IMAGE_CAPTURE = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit_inten)

        btnCapture.setOnClickListener {
            dispastchTakePictureIntent()
        }
    }
    fun dispastchTakePictureIntent(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)}
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            iv.setImageBitmap(imageBitmap)
        }
    }
}
