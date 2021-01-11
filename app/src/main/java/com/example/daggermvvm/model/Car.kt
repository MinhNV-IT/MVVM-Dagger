package com.example.daggermvvm.model

import javax.inject.Inject

class Car {
    @Inject
    lateinit var wheels: Wheels
    var engine: Engine
    lateinit var driver: Driver

    @Inject
    constructor(engine: Engine, driver: Driver) {
        // this.wheels = wheels
        this.engine = engine
        this.driver = driver
    }

    @Inject
    fun providesCarToRemote(remote: Remote) {
        remote.providesCar(this)
    }

    fun start() {
        println("Driver : $driver")
//        println("wheels :$wheels")
//        engine.start()
//        println("driving....")
    }
}
