package com.satyam.daggerdemo.application

import android.app.Application
import com.satyam.daggerdemo.DaggerSmartPhoneComponent
import com.satyam.daggerdemo.MemoryCardModule
import com.satyam.daggerdemo.SmartPhoneComponent

class SmartPhoneApplication : Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent= initDagger()
        super.onCreate()
    }
    private fun initDagger(): SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()


}