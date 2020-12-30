package com.example.daggermvvm.model

import javax.inject.Inject

class PetrolEngine : Engine {
    var powerCapacity: Int = 0

    @Inject
    constructor(powerCapacity: Int) {
        this.powerCapacity = powerCapacity
    }

    override fun start() {
        println("Petrol engine started ..$powerCapacity")
    }

}