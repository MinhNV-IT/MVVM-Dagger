package com.example.daggermvvm.model

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {
    var powerCapacity: Int = 0
    var engineCapacity: Int = 0


    @Inject
    constructor(@Named("power") powerCapacity: Int, @Named("engine") engineCapacity: Int) {
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        println("Petrol engine started ..$powerCapacity + $engineCapacity")
    }

}