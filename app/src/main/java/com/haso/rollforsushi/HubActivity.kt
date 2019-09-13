package com.haso.rollforsushi

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button



class HubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)




        var btn_new_activity = findViewById<Button>(R.id.button_favorites)

        btn_new_activity .setOnClickListener {
            val intent = Intent(this, FavoritesActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }

}