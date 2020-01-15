package com.example.testmodule

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log
import com.example.functionalprogramming.IMyAidlInterface

class MyService : Service() {
    companion object{
        const val TAG = "MyService"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
        println("onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder {
        println("onBind")
        return binder
    }

    var mBinder = object : Binder() {

        fun doSomething() {
            Log.d(TAG, "doSomething")
        }

    }

    private val binder = object : IMyAidlInterface.Stub() {
        override fun basicTypes() {
            println("111111111111")
        }

    }
}
