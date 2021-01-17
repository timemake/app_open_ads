package com.android.kotlinappopenads

import android.app.Application
import android.util.Log
import com.google.android.gms.ads.MobileAds

class MyApplication : Application() {

    private lateinit var appOpenManager: AppOpenManager

    override fun onCreate() {
        super.onCreate()

        MobileAds.initialize(this){
            Log.d("tag", "MobileAds init ")
        }

        appOpenManager = AppOpenManager(this)
    }
}