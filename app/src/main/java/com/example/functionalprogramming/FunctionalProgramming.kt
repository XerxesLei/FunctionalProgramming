package com.example.functionalprogramming

import java.util.*

object FunctionalProgramming {
    private lateinit var functionalProgramming : () -> Unit

    fun setFunctionalProgramming(f : () -> Unit) {
        functionalProgramming = f
    }

    fun start() {
        Timer().schedule(object : TimerTask(){
            override fun run() {
                functionalProgramming()
            }

        }, 10, 1000)
    }
}