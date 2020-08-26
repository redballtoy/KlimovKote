package com.example.p_03_01_buttonclicks

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counterCrows: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_click_crows.setOnClickListener {
            tv_show_crown_count.text = "I counted ${++counterCrows} crows"
            it.setBackgroundColor(Color.CYAN)
        }

    }
}
