package tech.carcher.felipe_rodriguez_20240415

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d(TAG, "APLICACION INICIADA")

        val sportEditText = findViewById<EditText>(R.id.editTextSport)
        val timeEditText = findViewById<EditText>(R.id.editTextTime)
        val showButton = findViewById<Button>(R.id.buttonShow)

        showButton.setOnClickListener {
            val sport = sportEditText.text.toString().trim()
            val time = timeEditText.text.toString().trim()

            if (sport.isEmpty() || time.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos.", Toast.LENGTH_LONG).show()
            } else {
                val message = "Deporte: $sport, Tiempo: $time minutos"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                Log.d(TAG, "ENTRENAMIENTO EN EJECUCION: $message")
            }
        }
    }
}