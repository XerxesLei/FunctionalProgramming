package com.example.functionalprogramming

import android.app.Application
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.functionalprogramming.java.TestClass
import com.example.testlib.MainActivity1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mViewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mViewPager2 = horViewPager
//
//        mViewPager2.apply {
//            adapter = Adapter()
//        }
        var a = 1f
        text.setOnClickListener {
            println("text click")
            startActivity(Intent(this, MainActivity1::class.java))
            //点击事件失效
//            text.startAnimation(TranslateAnimation(-100f,100f, -100f, 100f).apply {
//                duration = 1000
//                repeatMode = Animation.REVERSE
//                fillAfter = true
//            })
//            text.animate().setDuration(1000)
//                .translationX(a++)
//                .translationY(a++)
//                .start()
        }

        val testClass = TestClass()
//
//        FunctionalProgramming.setFunctionalProgramming {
//            println("FunctionalProgramming is run")
//        }
//        FunctionalProgramming.start()
    }

    private inner class Adapter : FragmentStateAdapter(this){
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {

            return ContentFragment.newInstance("1", "2")
        }

    }
}
