package com.example.functionalprogramming

import android.app.Application
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.provider.Settings
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
        val mServiceConnection = object : ServiceConnection {
            override fun onServiceDisconnected(name: ComponentName?) {
                println("service disconnected")
            }

            override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                println("service connected")
                var  m = IMyAidlInterface.Stub.asInterface(service)
                m.basicTypes()
            }

        }
        var a = 1f
//        text.setOnClickListener {
////            val intent = Intent(this, RemoteService::class.java)
////            bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE)
//
//            println("text click")
//            val s = packageManager.getInstalledApplications(0)
//            s.forEach {
//                if (it.packageName == "com.example.testmodule") {
//                    try {
//                        println(it.className)
//                        println(it.processName)
//                        var intent = Intent()
//                        var co = ComponentName(it.packageName, it.packageName.plus(".MyService"))
//                        intent.component = co
//                        //startActivity(intent)
//                        bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE)
//                    } catch (e : Exception) {
//                        println(e)
//                    }
//                    //bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE)
//                }
//            }
//            //startActivity(Intent(this, MainActivity1::class.java))
//            //点击事件失效
////            text.startAnimation(TranslateAnimation(-100f,100f, -100f, 100f).apply {
////                duration = 1000
////                repeatMode = Animation.REVERSE
////                fillAfter = true
////            })
////            text.animate().setDuration(1000)
////                .translationX(a++)
////                .translationY(a++)
////                .start()
//        }

        text.setOnClickListener {
            val intent = Intent()
            intent.action = "com.example.functionalprogramming.cc"
            intent.setPackage("com.example.testmodule")
            startService(intent)
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
