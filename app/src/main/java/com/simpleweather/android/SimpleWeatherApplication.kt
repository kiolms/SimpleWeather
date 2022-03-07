package com.simpleweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SimpleWeatherApplication: Application() {

    companion object{

        const val TOKEN = "1"

        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}