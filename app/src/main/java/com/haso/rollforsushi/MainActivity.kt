package com.haso.rollforsushi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


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
