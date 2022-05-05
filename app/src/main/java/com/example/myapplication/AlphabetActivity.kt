package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a=findViewById<Button>(R.id.a)
        val b=findViewById<Button>(R.id.b)
        val c=findViewById<Button>(R.id.c)
        val d=findViewById<Button>(R.id.d)
        val e=findViewById<Button>(R.id.e)
        val f=findViewById<Button>(R.id.f)
        val g=findViewById<Button>(R.id.g)
        val h=findViewById<Button>(R.id.h)
        val i=findViewById<Button>(R.id.i)
        val j=findViewById<Button>(R.id.j)
        val k=findViewById<Button>(R.id.k)
        val l=findViewById<Button>(R.id.l)
        val m=findViewById<Button>(R.id.m)
        val n=findViewById<Button>(R.id.n)
        val o=findViewById<Button>(R.id.o)
        val p=findViewById<Button>(R.id.p)
        val q=findViewById<Button>(R.id.q)
        val r=findViewById<Button>(R.id.r)
        val s=findViewById<Button>(R.id.s)
        val t=findViewById<Button>(R.id.t)
        val u=findViewById<Button>(R.id.u)
        val v=findViewById<Button>(R.id.v)
        val w=findViewById<Button>(R.id.w)
        val x=findViewById<Button>(R.id.x)
        val y=findViewById<Button>(R.id.y)
        val z=findViewById<Button>(R.id.z)


        val resultsTextView=findViewById<TextView>(R.id.resultstextView)


        a.setOnClickListener{
            resultsTextView.text="A"
            val mp =MediaPlayer.create(this, R.raw.a)
            mp.start()
        }
        b.setOnClickListener{
            resultsTextView.text="B"
            val mp =MediaPlayer.create(this, R.raw.b)
            mp.start()
        }
        c.setOnClickListener{
            resultsTextView.text="C"
            val mp =MediaPlayer.create(this, R.raw.c)
            mp.start()
        }
        d.setOnClickListener{
            resultsTextView.text="D"
            val mp =MediaPlayer.create(this, R.raw.d)
            mp.start()
        }
        e.setOnClickListener{
            resultsTextView.text="E"
            val mp =MediaPlayer.create(this, R.raw.e)
            mp.start()
        }
        f.setOnClickListener{
            resultsTextView.text="F"
            val mp =MediaPlayer.create(this, R.raw.f)
            mp.start()
        }
        g.setOnClickListener{
            resultsTextView.text="G"
            val mp =MediaPlayer.create(this, R.raw.g)
            mp.start()
        }
        h.setOnClickListener{
            resultsTextView.text="H"
            val mp =MediaPlayer.create(this, R.raw.h)
            mp.start()
        }
        i.setOnClickListener{
            resultsTextView.text="I"
            val mp =MediaPlayer.create(this, R.raw.i)
            mp.start()
        }
        j.setOnClickListener{
            resultsTextView.text="J"
            val mp =MediaPlayer.create(this, R.raw.j)
            mp.start()
        }
        k.setOnClickListener{
            resultsTextView.text="K"
            val mp =MediaPlayer.create(this, R.raw.k)
            mp.start()
        }
        l.setOnClickListener{
            resultsTextView.text="L"
            val mp =MediaPlayer.create(this, R.raw.l)
            mp.start()
        }
        m.setOnClickListener{
            resultsTextView.text="M"
            val mp =MediaPlayer.create(this, R.raw.m)
            mp.start()
        }
        n.setOnClickListener{
            resultsTextView.text="N"
            val mp =MediaPlayer.create(this, R.raw.n)
            mp.start()
        }
        o.setOnClickListener{
            resultsTextView.text="O"
            val mp =MediaPlayer.create(this, R.raw.o)
            mp.start()
        }
        p.setOnClickListener{
            resultsTextView.text="P"
            val mp =MediaPlayer.create(this, R.raw.p)
            mp.start()
        }
        q.setOnClickListener{
            resultsTextView.text="Q"
            val mp =MediaPlayer.create(this, R.raw.q)
            mp.start()
        }
        r.setOnClickListener{
            resultsTextView.text="R"
            val mp =MediaPlayer.create(this, R.raw.r)
            mp.start()
        }
        s.setOnClickListener{
            resultsTextView.text="S"
            val mp =MediaPlayer.create(this, R.raw.s)
            mp.start()
        }
        t.setOnClickListener{
            resultsTextView.text="T"
            val mp =MediaPlayer.create(this, R.raw.t)
            mp.start()
        }
        u.setOnClickListener{
            resultsTextView.text="U"
            val mp =MediaPlayer.create(this, R.raw.u)
            mp.start()
        }
        v.setOnClickListener{
            resultsTextView.text="V"
            val mp =MediaPlayer.create(this, R.raw.v)
            mp.start()
        }
        w.setOnClickListener{
            resultsTextView.text="W"
            val mp =MediaPlayer.create(this, R.raw.w)
            mp.start()
        }
        x.setOnClickListener{
            resultsTextView.text="X"
            val mp =MediaPlayer.create(this, R.raw.x)
            mp.start()
        }
        y.setOnClickListener{
            resultsTextView.text="Y"
            val mp =MediaPlayer.create(this, R.raw.y)
            mp.start()
        }
        z.setOnClickListener{
            resultsTextView.text="Z"
            val mp =MediaPlayer.create(this, R.raw.z)
            mp.start()
        }

    }
}