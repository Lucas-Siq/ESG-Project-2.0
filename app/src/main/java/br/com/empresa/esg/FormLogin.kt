package br.com.empresa.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_form_login)

        val souempresa: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.sou_empresa)

        souempresa.setOnClickListener{
            val i = Intent(this, FormLogin2::class.java)
            startActivity(i)
        }

        val entrar: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.button_entrar)

        entrar.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val cadastrar: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.linkcadastrar2)

        cadastrar.setOnClickListener{
            val i = Intent(this, FormularioCadastro::class.java)
            startActivity(i)
        }

    }
}