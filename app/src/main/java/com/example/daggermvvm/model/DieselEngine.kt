package com.example.daggermvvm.model

import javax.inject.Inject

class DieselEngine : Engine {
    @Inject
    constructor() {

    }

    override fun start() {
        println("Diesel engine started ..")
    }

}
