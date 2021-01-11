package com.example.daggermvvm.model

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun providesRims(): Rims {
        println("Wheels Rims")
        return Rims()
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        println("Wheels module")
        return Wheels(rims, tires)
    }

    @Provides
    fun providesTires(): Tires {
        println("Wheels Tires")
        return Tires()
    }
}
