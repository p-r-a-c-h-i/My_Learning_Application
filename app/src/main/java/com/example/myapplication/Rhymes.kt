package com.example.myapplication

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
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
        val stop = findViewById<Button>(R.id.stop)
        val mpj=MediaPlayer.create(this, R.raw.johnny)
        val mps = MediaPlayer.create(this, R.raw.sheep)
        val spiderm = MediaPlayer.create(this, R.raw.spider)
        val mpt = MediaPlayer.create(this, R.raw.twinkle)
        johnny.setOnClickListener {
            if(mpj.isPlaying){
                mpj.stop()
            }
            else if(mps.isPlaying){
                mps.stop()
            }
            else if(spiderm.isPlaying){
                spiderm.stop()
            }
            else if(mpt.isPlaying){
                mpt.stop()
            }
            mpj.start()
        }

        sheep.setOnClickListener {
            if(mpj.isPlaying){
                mpj.stop()
            }
            else if(mps.isPlaying){
                mps.stop()
            }
            else if(spiderm.isPlaying){
                spiderm.stop()
            }
            else if(mpt.isPlaying){
                mpt.stop()
            }
            mps.start()
        }

        spider.setOnClickListener {
            if(mpj.isPlaying){
                mpj.stop()
            }
            else if(mps.isPlaying){
                mps.stop()
            }
            else if(spiderm.isPlaying){
                spiderm.stop()
            }
            else if(mpt.isPlaying){
                mpt.stop()
            }
            spiderm.start()
        }

        twinkle.setOnClickListener {
            if(mpj.isPlaying){
                mpj.stop()
            }
            else if(mps.isPlaying){
                mps.stop()
            }
            else if(spiderm.isPlaying){
                spiderm.stop()
            }
            else if(mpt.isPlaying){
                mpt.stop()
            }
            mpt.start()
        }

        stop.setOnClickListener{
            if(mpj.isPlaying){
                mpj.stop()
            }
            else if(mps.isPlaying){
                mps.stop()
            }
            else if(spiderm.isPlaying){
                spiderm.stop()
            }
            else if(mpt.isPlaying){
                mpt.stop()
            }
        }
    }



}