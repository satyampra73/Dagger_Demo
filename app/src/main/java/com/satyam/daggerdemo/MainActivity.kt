package com.satyam.daggerdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhone = SmartPhone(Battery(), SIMCard(ServiceProvider()), MemoryCard())
        smartPhone.makeACallWithRecording()

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()

    }
}