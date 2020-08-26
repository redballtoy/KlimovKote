package com.example.p_04_01_colorchange_trafficlights

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        bt_red.setOnClickListener { 
            ct_root_layout.setBackgroundColor(Color.RED)
            tv_show_color_name.text = getString(R.string.red)
        }

        bt_yellow.setOnClickListener {
            ct_root_layout.setBackgroundColor(Color.YELLOW)
            tv_show_color_name.text = getString(R.string.yellow)
        }

        bt_green.setOnClickListener {
            ct_root_layout.setBackgroundColor(Color.GREEN)
            tv_show_color_name.text = getString(R.string.green)
        }
        
        
    }
}
