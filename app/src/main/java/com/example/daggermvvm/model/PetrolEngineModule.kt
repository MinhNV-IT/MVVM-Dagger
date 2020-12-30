package com.example.daggermvvm.model

import dagger.Module
import dagger.Provides


@Module
class PetrolEngineModule {
    var powerCapacity: Int = 0

    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }

    @Provides
    fun providesPetrolEngine(): Engine {
        return PetrolEngine(powerCapacity)
    }
}
