package com.satyam.daggerdemo

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){
    init {
        Log.i("MYTAG","Service Provider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connected")
    }
}