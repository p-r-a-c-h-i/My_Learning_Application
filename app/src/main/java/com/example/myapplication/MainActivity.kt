package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.constraintlayout.utils.widget.ImageFilterButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

       val a=findViewById<ImageView>(R.id.imgalphabets)
       val n=findViewById<ImageView>(R.id.imgnumbers)
        a.setOnClickListener{
            val intent= Intent(this,AlphabetActivity::class.java)
            this.startActivity(intent)
        }
        n.setOnClickListener{
            val intent= Intent(this,Numbers::class.java)
            this.startActivity(intent)
        }
    }
}
