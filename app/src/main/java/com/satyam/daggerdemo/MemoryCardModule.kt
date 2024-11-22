package com.satyam.daggerdemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize:Int) {

    @Provides
    fun providesMemoryCard():MemoryCard{
        Log.i("MYTAG","memorySize: "+memorySize)
        return MemoryCard()
    }

}