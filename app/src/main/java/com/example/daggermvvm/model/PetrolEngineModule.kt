package com.example.daggermvvm.model

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {
    //var powerCapacity: Int = 0

//    constructor(powerCapacity: Int) {
//        this.powerCapacity = powerCapacity
//    }

    //    @Provides
//    fun providesPetrolEngine(powerCapacity: Int, engineCapacity: Int): Engine {
//        return PetrolEngine(powerCapacity, engineCapacity)
//    }
    @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine {
        return petrolEngine
    }
}
