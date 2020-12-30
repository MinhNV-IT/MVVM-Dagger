package com.example.daggermvvm.model

import javax.inject.Inject

class Remote {
    lateinit var car: Car

    @Inject
    constructor() {

    }

    fun providesCar(car: Car) {
        println("provides car to remote")
        this.car = car
    }
}