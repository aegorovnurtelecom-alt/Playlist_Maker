package com.practicum.playlistmaker
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMedia = findViewById<Button>(R.id.buttonMedia)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val buttonSettings = findViewById<Button>(R.id.buttonSettings)

        buttonMedia.setOnClickListener{
            val intent = Intent(this, MediaActivity::class.java)
            startActivity(intent)
        }

        buttonSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        buttonSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }

}