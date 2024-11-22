package com.satyam.daggerdemo

import android.util.Log
import javax.inject.Inject

class NickleCadmiumBattery  @Inject constructor() : Battery{

    override fun getPower() {
        Log.i("MYTAG", "POwer from Nickle Cadmimum Battery")
    }

}