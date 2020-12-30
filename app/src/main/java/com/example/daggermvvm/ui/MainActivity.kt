package com.example.daggermvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggermvvm.R
import com.example.daggermvvm.di.DaggerCarComponent
import com.example.daggermvvm.model.Car
import com.example.daggermvvm.model.PetrolEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // val carponent = DaggerCarComponent.create()
        val carComponent =
            DaggerCarComponent.builder().petrolEngineModule(PetrolEngineModule(100)).build()
        carComponent.inject(this)
        car.start()
    }
}
