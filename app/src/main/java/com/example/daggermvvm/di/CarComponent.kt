package com.example.daggermvvm.di

import com.example.daggermvvm.model.Car
import com.example.daggermvvm.model.PetrolEngineModule
import com.example.daggermvvm.model.WheelsModule
import com.example.daggermvvm.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    //@Component.Builder
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun powerCapacity(@Named("power") powerCapacity: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine") engineCapacity: Int): Builder
        fun build(): CarComponent
    }
}
