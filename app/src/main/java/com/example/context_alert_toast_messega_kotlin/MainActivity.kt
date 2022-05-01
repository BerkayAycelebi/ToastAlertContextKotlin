package com.example.context_alert_toast_messega_kotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Hoşgeldiniz..!",Toast.LENGTH_SHORT).show()
    }

    fun showMessege(view:View)
    {
        val alertMessega=AlertDialog.Builder(this)
        alertMessega.setTitle("Şifre Hatası")
        alertMessega.setMessage("Şifreyi eksik veya hatalı girdiniz, tekrar denemek ister misiniz?")
        alertMessega.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Baştan deniyorsunuz",Toast.LENGTH_SHORT).show()
        })
        alertMessega.setNegativeButton("Hayır",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Hayırı seçtiniz deneyemiyorsunuz",Toast.LENGTH_SHORT).show()
        })

        alertMessega.show()
    }
}