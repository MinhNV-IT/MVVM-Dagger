package com.example.daggermvvm.model

import javax.inject.Inject

class Car {
    var wheels: Wheels
    var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    fun start() {
        engine.start()
        println("driving....")
    }
}
