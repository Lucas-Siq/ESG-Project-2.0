package br.com.empresa.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FormLogin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_form_login2)

        val soucolaborador: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.sou_colaborador)

        soucolaborador.setOnClickListener{
            val i = Intent(this, FormLogin::class.java)
            startActivity(i)
        }

        val entrar: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.button_entrar2)

        entrar.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val cadastrar: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.linkcadastrar)

        cadastrar.setOnClickListener{
            val i = Intent(this, FormularioCadastro::class.java)
            startActivity(i)
        }

    }
}