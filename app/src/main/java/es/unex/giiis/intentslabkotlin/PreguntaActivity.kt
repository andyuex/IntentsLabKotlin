package es.unex.giiis.intentslabkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class PreguntaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)

        val bResponder = findViewById<Button>(R.id.bResponder)
        val eDRespuesta = findViewById<EditText>(R.id.eTRespuesta)

        bResponder.setOnClickListener {
            val intent = Intent()
            val respuesta = eDRespuesta.text.toString()
            intent.putExtra("DATOS", respuesta)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
