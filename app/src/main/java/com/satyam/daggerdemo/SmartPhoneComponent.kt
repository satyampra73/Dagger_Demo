package com.satyam.daggerdemo

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}