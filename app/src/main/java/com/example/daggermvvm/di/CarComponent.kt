package com.example.daggermvvm.di

import com.example.daggermvvm.model.Car
import com.example.daggermvvm.model.PetrolEngineModule
import com.example.daggermvvm.model.WheelsModule
import com.example.daggermvvm.ui.MainActivity
import dagger.Component

@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}
