package com.example.daggermvvm.app

import android.app.Application
import com.example.daggermvvm.di.CarComponent
import com.example.daggermvvm.di.DaggerCarComponent

class ExampleApp : Application() {
    lateinit var carComponent: CarComponent
    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder()
            .powerCapacity(100)
            .engineCapacity(1000)
            .build()
    }

    fun carComponent(): CarComponent {
        return carComponent
    }
}