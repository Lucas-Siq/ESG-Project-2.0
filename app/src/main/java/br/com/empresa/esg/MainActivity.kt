package br.com.empresa.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)

        val semana: ImageView = findViewById<ImageView>(R.id.banner_semana_agua2)

        semana.setOnClickListener{
            val i = Intent(this, SemanaActivity::class.java)
            startActivity(i)
        }


        val vermais: TextView = findViewById<TextView>(R.id.txt_vermais)

        vermais.setOnClickListener{
            val i = Intent(this, perfil::class.java)
            startActivity(i)
        }

    }
}