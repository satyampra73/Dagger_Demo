package com.satyam.daggerdemo

import dagger.Component

@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {
    fun inject (mainActivity: MainActivity)
}