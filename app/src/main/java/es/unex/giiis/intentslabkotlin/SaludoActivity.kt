package es.unex.giiis.intentslabkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        val name = intent.getStringExtra("NOMBRE") ?: ""

        val tVSaludo = findViewById<TextView>(R.id.tVSaludo)
        tVSaludo.text = "Hola, $name"
    }
}
