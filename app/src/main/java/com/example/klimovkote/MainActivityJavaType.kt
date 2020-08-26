package com.example.klimovkote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivityJavaType : AppCompatActivity() {

    private lateinit var tvShowKateName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowKateName = findViewById(R.id.tv_show_kote_name)

        var ibGetKoteName = findViewById<ImageButton>(R.id.ib_get_kote_name)
        ibGetKoteName.setOnClickListener {
            tvShowKateName.setText("Hello Kitty! as Java Style code")
        }
    }
}