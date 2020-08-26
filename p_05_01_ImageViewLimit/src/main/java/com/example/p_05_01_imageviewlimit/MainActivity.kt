package com.example.p_05_01_imageviewlimit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_ansver.setOnClickListener {
            val phrases = listOf<String>(
                getString(R.string.str_01),
                getString(R.string.str_02),
                getString(R.string.str_03),
                getString(R.string.str_04),
                getString(R.string.str_05),
                getString(R.string.str_06),
                getString(R.string.str_07),
            )

            val imagesId = listOf<Int>(
                resources.getIdentifier("cote_01", "drawable", packageName),
                resources.getIdentifier("cote_02", "drawable", packageName),
                resources.getIdentifier("cote_03", "drawable", packageName)
            )

            val shuffledList = phrases.shuffled()
            tv_cote_01.text = shuffledList[0]
            tv_cote_02.text = shuffledList[1]
            tv_cote_03.text = shuffledList[2]

            val suffleImageList = imagesId.shuffled()
            iv_cote_01.setImageDrawable(getDrawable(suffleImageList[0]))
            iv_cote_02.setImageDrawable(getDrawable(suffleImageList[1]))
            iv_cote_03.setImageDrawable(getDrawable(suffleImageList[2]))
        }
    }

}
