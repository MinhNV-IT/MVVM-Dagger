package com.example.daggermvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggermvvm.R
import com.example.daggermvvm.app.ExampleApp
import com.example.daggermvvm.di.DaggerCarComponent
import com.example.daggermvvm.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

   // @Inject
    lateinit var car1: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  val carponent = DaggerCarComponent.create()
        val carComponent = (application as ExampleApp).carComponent

//        val carComponent1 =
//            DaggerCarComponent.builder()
//                .powerCapacity(100)
//                .engineCapacity(1000)
//                .build()

        carComponent.inject(this)
        //car = carComponent.getCar()
        car.start()
//        car1 = carComponent1.getCar()
//        car1.start()
    }
}
