package com.satyam.daggerdemo

import android.util.Log
import javax.inject.Inject

//if any class is coming from any library then we can not use inject , lets assume this is an class  like this.
class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}