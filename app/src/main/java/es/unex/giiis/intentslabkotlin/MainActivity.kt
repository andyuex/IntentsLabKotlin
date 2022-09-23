package es.unex.giiis.intentslabkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE = 76
    lateinit var mtVRespuesta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val eDName = findViewById<EditText>(R.id.editTextTextPersonName)
        mtVRespuesta = findViewById<TextView>(R.id.tVRespuesta)
        val bPreguntar = findViewById<Button>(R.id.bPreguntar)
        val bNavegar = findViewById<Button>(R.id.button3)

        bSaludar.setOnClickListener {
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            val name = eDName.text.toString()
            intent.putExtra("NOMBRE", name)
            startActivity(intent)
        }

        bPreguntar.setOnClickListener {
            val intent = Intent(this@MainActivity, PreguntaActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }

        bNavegar.setOnClickListener {
            val webPage = Uri.parse("https://www.android.com")
            val webIntent = Intent(Intent.ACTION_VIEW, webPage)
            val chooser = Intent.createChooser(webIntent, "Title")
            startActivity(chooser)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE  && resultCode == RESULT_OK) {
            val respuesta = data?.getStringExtra("DATOS") ?: ""
            mtVRespuesta.text = respuesta
        }
    }
}
