package com.example.dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tombolDialog)
        val tombol = findViewById<Button>(R.id.tombolDialog2)

        tombol.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("info")
                .setMessage("Nama: Hadir sastra imam p")
                .setMessage("Kelas: XI PPLG 1")
                .setMessage("Nis:2233256")
                .setPositiveButton("yes", { dialogInterface, i ->

                })
                .setNegativeButton("No", { dialogInterface, i ->
                    Toast.makeText(this, "Tobol Di Tekan", Toast.LENGTH_SHORT).show()

                })
                .show()

            tombol.setOnClickListener { 
                AlertDialog.Builder(this)
                    .setTitle("input")
                    .setPositiveButton("yes", { dialogInterface, i -> })
                    .setNegativeButton("No",DialogInterface.OnClickListener{dialogInterface, i ->  })
                
            }
        }
    }
}