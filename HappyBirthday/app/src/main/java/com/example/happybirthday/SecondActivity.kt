package com.example.happybirthday

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView


class SecondActivity : AppCompatActivity() {
    private  var mediaPlayer: MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName=intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.wishing)
        val greetingText="Happy BirthDay !, $userName 🎉"
        textView.text=greetingText
       mediaPlayer=MediaPlayer.create(this,R.raw.music)


    }

    override fun onResume() {
        super.onResume()
        mediaPlayer?.start()
    }

//    override fun onRestart() {
//        super.onRestart()
//        mediaPlayer?.
//    }
    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()


    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.stop()
        mediaPlayer?.reset()
        mediaPlayer?.release()
        mediaPlayer=null
    }

}