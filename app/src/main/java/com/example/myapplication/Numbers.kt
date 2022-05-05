package com.example.myapplication

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Numbers: AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.numbers)

        val n1=findViewById<Button>(R.id.n1)
        val n2=findViewById<Button>(R.id.n2)
        val n3=findViewById<Button>(R.id.n3)
        val n4=findViewById<Button>(R.id.n4)
        val n5=findViewById<Button>(R.id.n5)
        val n6=findViewById<Button>(R.id.n6)
        val n7=findViewById<Button>(R.id.n7)
        val n8=findViewById<Button>(R.id.n8)
        val n9=findViewById<Button>(R.id.n9)
        val n10=findViewById<Button>(R.id.n10)
        val resultsTextView=findViewById<TextView>(R.id.resultstextView1)
        n1.setOnClickListener{
            resultsTextView.text="ONE 1"
            val mp = MediaPlayer.create(this, R.raw.n1)
            val mp1 = MediaPlayer.create(this, R.raw.o)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.n)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.e)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp.start()
                    }
                }
            }
        }
        n2.setOnClickListener{
            resultsTextView.text="TWO 2"
            val mp= MediaPlayer.create(this, R.raw.n2)
            val mp1 = MediaPlayer.create(this, R.raw.t)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.w)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.o)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp.start()
                    }
                }
            }
        }
        n3.setOnClickListener{
            resultsTextView.text="THREE 3"
            val mp= MediaPlayer.create(this, R.raw.n3)
            val mp1 = MediaPlayer.create(this, R.raw.t)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.h)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.r)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        val mp4 = MediaPlayer.create(this, R.raw.e)
                        mp4.start()
                        mp4.setOnCompletionListener {
                            mp4.start()
                            mp4.setOnCompletionListener {
                                mp.start()
                            }
                        }
                    }
                }
            }
        }
        n4.setOnClickListener{
            resultsTextView.text="FOUR 4"
            val mp= MediaPlayer.create(this, R.raw.n4)
            val mp1 = MediaPlayer.create(this, R.raw.f)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.o)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.u)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        val mp4 = MediaPlayer.create(this, R.raw.r)
                        mp4.start()
                        mp4.setOnCompletionListener {
                            mp.start()
                        }
                    }
                }
            }
        }
        n5.setOnClickListener{
            resultsTextView.text="FIVE 5"
            val mp= MediaPlayer.create(this, R.raw.n5)
            val mp1 = MediaPlayer.create(this, R.raw.f)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.i)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.v)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        val mp4 = MediaPlayer.create(this, R.raw.e)
                        mp4.start()
                        mp4.setOnCompletionListener {
                            mp.start()
                        }
                    }
                }
            }
        }
        n6.setOnClickListener{
            resultsTextView.text="SIX 6"
            val mp= MediaPlayer.create(this, R.raw.n6)
            val mp1 = MediaPlayer.create(this, R.raw.s)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.i)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.x)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp.start()
                    }
                }
            }
        }
        n7.setOnClickListener{
            resultsTextView.text="SEVEN 7"
            val mp= MediaPlayer.create(this, R.raw.n7)
            val mp1 = MediaPlayer.create(this, R.raw.s)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.e)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.v)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp2.start()
                        mp2.setOnCompletionListener {
                            val mp4 = MediaPlayer.create(this, R.raw.n)
                            mp4.start()
                            mp4.setOnCompletionListener {
                                mp.start()
                            }
                        }
                    }
                }
            }
        }
        n8.setOnClickListener{
            resultsTextView.text="EIGHT 8"
            val mp= MediaPlayer.create(this, R.raw.n8)
            val mp1 = MediaPlayer.create(this, R.raw.e)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.i)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.g)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        val mp4 = MediaPlayer.create(this, R.raw.h)
                        mp4.start()
                        mp4.setOnCompletionListener {
                            val mp5 = MediaPlayer.create(this,R.raw.t)
                            mp5.start()
                            mp5.setOnCompletionListener {
                                mp.start()
                            }
                        }
                    }
                }
            }
        }
        n9.setOnClickListener{
            resultsTextView.text="NINE 9"
            val mp= MediaPlayer.create(this, R.raw.n9)
            val mp1 = MediaPlayer.create(this, R.raw.n)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.i)
                mp2.start()
                mp2.setOnCompletionListener {
                    mp1.start()
                    mp1.setOnCompletionListener {
                        val mp3 = MediaPlayer.create(this, R.raw.e)
                        mp3.start()
                        mp3.setOnCompletionListener {
                            mp.start()
                        }
                    }
                }
            }
        }
        n10.setOnClickListener{
            resultsTextView.text="TEN 1"
            val mp= MediaPlayer.create(this, R.raw.n10)
            val mp1 = MediaPlayer.create(this, R.raw.t)
            mp1.start()
            mp1.setOnCompletionListener {
                val mp2 = MediaPlayer.create(this, R.raw.e)
                mp2.start()
                mp2.setOnCompletionListener {
                    val mp3 = MediaPlayer.create(this, R.raw.n)
                    mp3.start()
                    mp3.setOnCompletionListener {
                        mp.start()
                    }
                }
            }
        }
    }
}