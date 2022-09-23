package es.unex.giiis.intentslabkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val eDName = findViewById<EditText>(R.id.editTextTextPersonName)

        bSaludar.setOnClickListener {
            val intent = Intent(this, SaludoActivity::class.java)
            val name = eDName.text.toString()
            intent.putExtra("NOMBRE", name)
            startActivity(intent)
        }
    }
}
