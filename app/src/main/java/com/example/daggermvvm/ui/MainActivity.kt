package com.example.daggermvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggermvvm.R
import com.example.daggermvvm.di.DaggerCarComponent
import com.example.daggermvvm.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.start()
    }
}
