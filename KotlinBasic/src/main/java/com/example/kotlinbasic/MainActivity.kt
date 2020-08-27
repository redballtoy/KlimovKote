package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.net.URL

class MainActivity : AppCompatActivity() {

    val myLog = "myLogs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //не обязательно ставить точку с запятой в выражении
        //единственное место где требуется ставить точку с запятой
        //в перечислении enum
        val x = 1
        val y = 2

        Log.d(myLog, "x= "+x.toString())
        Log.d(myLog, "y= "+y.toString())

        //позволяет не указывать тип если тип виден из контекста
        //включает популярные методы для быстрого вызова
        //val address="http://example.com"
        //val someText = URL(address).readText()
        //Log.d(myLog,someText)

        //Если переменная не ициализирована то тип надо обязательно указывать
        val age: Int
        age=7
        Log.d(myLog, "age is: "+age.toString())

    }
}
