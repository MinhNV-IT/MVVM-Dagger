package com.example.daggermvvm.model

import javax.inject.Inject

class Car {
    @Inject
    lateinit var wheels: Wheels
    var engine: Engine

    @Inject
    constructor(engine: Engine) {
        // this.wheels = wheels
        this.engine = engine
    }

    @Inject
    fun providesCarToRemote(remote: Remote) {
        remote.providesCar(this)
    }

    fun start() {
        println("wheels :$wheels")
        engine.start()
        println("driving....")
    }
}
