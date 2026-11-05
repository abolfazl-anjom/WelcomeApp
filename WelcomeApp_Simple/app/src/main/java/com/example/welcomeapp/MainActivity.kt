package com.example.welcomeapp

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeButton = findViewById<Button>(R.id.welcomeButton)

        welcomeButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("خوش آمدید")
                .setPositiveButton("بستن") { dialog, _ ->
                    dialog.dismiss()
                }
                .setOnDismissListener {
                    Toast.makeText(this, "خداحافظ", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}
