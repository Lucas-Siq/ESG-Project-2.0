package br.com.empresa.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_perfil)

        val voltar3: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.button_voltar3)

        voltar3.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }


    }
}