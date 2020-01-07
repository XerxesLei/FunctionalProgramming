package com.example.functionalprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FunctionalProgramming.setFunctionalProgramming {
            println("FunctionalProgramming is run")
        }
        FunctionalProgramming.start()
    }
}
