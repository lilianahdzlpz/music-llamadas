package com.ejemplo.musica

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val texto = TextView(this)
        texto.text = "¡Hola! La app base funciona"
        texto.textSize = 22f
        texto.setPadding(48, 48, 48, 48)
        setContentView(texto)
    }
}
