package com.example.myapplication

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Rhymes: AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rhymes)
        val johnny = findViewById<ImageView>(R.id.jhonny)
        val sheep = findViewById<ImageView>(R.id.sheep)
        val spider = findViewById<ImageView>(R.id.spider)
        val twinkle = findViewById<ImageView>(R.id.twinkle)

        johnny.setOnClickListener {

            val mp = MediaPlayer.create(this, R.raw.johnny)
            mp.start()
        }

        sheep.setOnClickListener {

            val mp = MediaPlayer.create(this, R.raw.sheep)
            mp.start()
        }

        spider.setOnClickListener {

            val mp = MediaPlayer.create(this, R.raw.spider)
            mp.start()
        }

        twinkle.setOnClickListener {

            val mp = MediaPlayer.create(this, R.raw.twinkle)
            mp.start()
        }
    }

}