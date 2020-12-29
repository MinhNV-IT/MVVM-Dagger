package com.example.daggermvvm.model

import dagger.Binds
import dagger.Module


@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine
}