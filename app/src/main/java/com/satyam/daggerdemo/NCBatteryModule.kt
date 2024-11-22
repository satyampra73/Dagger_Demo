package com.satyam.daggerdemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun ncBindsBattery(nickleCadmiumBattery: NickleCadmiumBattery): Battery

}