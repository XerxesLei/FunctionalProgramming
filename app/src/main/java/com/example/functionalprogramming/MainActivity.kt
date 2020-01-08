package com.example.functionalprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 1f
        text.setOnClickListener {
            println("text click")
            //点击事件失效
            text.startAnimation(TranslateAnimation(-100f,100f, -100f, 100f).apply {
                duration = 1000
                repeatMode = Animation.REVERSE
                fillAfter = true
            })
            text.animate().setDuration(1000)
                .translationX(a++)
                .translationY(a++)
                .start()
        }

        FunctionalProgramming.setFunctionalProgramming {
            println("FunctionalProgramming is run")
        }
        FunctionalProgramming.start()
    }
}
