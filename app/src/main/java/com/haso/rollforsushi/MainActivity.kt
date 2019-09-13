package com.haso.rollforsushi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var btn_new_activity = findViewById<Button>(R.id.button_get_lunch)

        btn_new_activity .setOnClickListener {
            val intent = Intent(this, HubActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}
