package com.example.jobshhet5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_switch: Button
    private lateinit var btn_move: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_switch = findViewById(R.id.btn_switch)
        btn_move= findViewById(R.id.btn_move_data)
        btn_switch.setOnClickListener(this)
        btn_move.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_switch -> {
                val move = Intent (this@MainActivity, MainActivity3 ::class.java)
                startActivity(move)
            }
            R.id.btn_move_data -> {
                val move = Intent (this@MainActivity, MainActivity3::class.java)
                move.putExtra(MainActivity3.EXTRA_NAME, "LAILA")
                move.putExtra(MainActivity3.EXTRA_AGE, "20")
                startActivity(move)
            }
        }
    }

}