package com.example.atividade02.data.classes

import android.content.Context
import android.media.MediaPlayer
import com.example.atividade02.R
import com.example.atividade02.data.interfaces.AcaoUsuario

class AcaoPersonalizada(private val context: Context) : AcaoUsuario {
    private var mediaPlayer: MediaPlayer? = null
    override fun realizarAcao(): String {
        mediaPlayer = MediaPlayer.create(context, R.raw.ff_vii_victory_fanfare)

        mediaPlayer?.let {
            if (!it.isPlaying) {
                it.start()
            }
        }
        return "É pra já!"
    }
}