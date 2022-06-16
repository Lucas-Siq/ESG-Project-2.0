package br.com.empresa.esg

import BitmapHelper
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.SupportMapFragment as SupportMapFragment1

class SemanaActivity : AppCompatActivity() {
    // -23.6215756,-46.6432017 Alameda Maruás, 71 - Planalto Paulista, São Paulo - SP, 04068-110

    // -23.5559293,-46.6708018 Av. Dr. Enéas Carvalho de Aguiar, 250a - Cerqueira César, São Paulo - SP, 05403-000

    //-23.5490315,-46.6030753 Av. Alcântara Machado, 2200 - Mooca, São Paulo - SP, 03101-005

    private val places = arrayListOf(
        Place("Horta-Viva 1", LatLng(-23.6215756,-46.6432017), "Alameda Maruás, 71 - Planalto Paulista, São Paulo - SP, 04068-110", 4.8f),
        Place("Horta-Viva 2", LatLng(-23.5559293,-46.6708018), "Av. Dr. Enéas Carvalho de Aguiar, 250a - Cerqueira César, São Paulo - SP, 05403-000", 4.8f),
        Place("Horta-Viva 3", LatLng(-23.5490315,-46.6030753), "Av. Alcântara Machado, 2200 - Mooca, São Paulo - SP, 03101-005", 4.8f)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_semana)

        val voltar: Button = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.button_voltar2)

        voltar.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }


        val maps1:TextView = findViewById<TextView>(R.id.place_icon1)

        maps1.setOnClickListener {

            val loja1 = Intent(Intent.ACTION_VIEW)
            loja1.data = Uri.parse("https://goo.gl/maps/shbvuqWed2Xt15H97")
            startActivity(loja1)

        }


        val maps2:TextView = findViewById<TextView>(R.id.place_icon2)

        maps2.setOnClickListener {

            val loja2 = Intent(Intent.ACTION_VIEW)
            loja2.data = Uri.parse("https://goo.gl/maps/VQhDorZYN3YycRN4A")
            startActivity(loja2)

        }


        val maps3:TextView = findViewById<TextView>(R.id.place_icon3)

        maps3.setOnClickListener {

            val loja3 = Intent(Intent.ACTION_VIEW)
            loja3.data = Uri.parse("https://goo.gl/maps/gaTeFM9iqaBjdqxh6")
            startActivity(loja3)

        }



        val mapFragment: SupportMapFragment1 = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment1
        mapFragment.getMapAsync { googleMap ->
            addMarkers(googleMap)

            googleMap.setOnMapLoadedCallback {
                val bounds = LatLngBounds.builder()

                places.forEach{
                    bounds.include(it.latLng)
                }

                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 100))

            }
        }

    }

    private fun addMarkers(googleMap:GoogleMap){
        places.forEach{ place ->
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .snippet(place.adress)
                    .position(place.latLng)
                    .icon(
                        BitmapHelper.vectorToBitmap(this, R.drawable.ic_baseline_location_on_24, ContextCompat.getColor(this, R.color.green_esg))
                    )
            )
        }
    }

}


data class Place(
        val name: String,
        val latLng: LatLng,
        val adress: String,
        val rating: Float
    )