package com.example.daggermvvm.model

import dagger.Module
import dagger.Provides
@Module
class WheelsModule {
    @Provides
    fun providesWheels(): Wheels {
        println("Wheels module")
        return Wheels()
    }
}