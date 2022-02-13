package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ButtonBoiActivity : AppCompatActivity() {

    companion object {
         const val POS  = "1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_boi)

        val positionId = intent?.extras?.getString(POS).toString()

        val button = findViewById<Button>(R.id.button_booty)

        button.setOnClickListener(View.OnClickListener {
            fun playAudio(position : Int) {
                var mediaPlayer = MediaPlayer.create(this, position)
                mediaPlayer.start()
            }
            when (positionId) {

                "0" -> playAudio(R.raw.wowa)
                "1" -> playAudio(R.raw.wowb)
                "2" -> playAudio(R.raw.wowc)
                "3" -> playAudio(R.raw.wowd)
                "4" -> playAudio(R.raw.wowe)
                "5" -> playAudio(R.raw.wowf)
                "6" -> playAudio(R.raw.wowg)
                "7" -> playAudio(R.raw.wowq)
                "8" -> playAudio(R.raw.wowv)
                "9" -> playAudio(R.raw.wowy)

            }
        })


    }


}