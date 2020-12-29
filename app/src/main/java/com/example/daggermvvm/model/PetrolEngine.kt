package com.example.daggermvvm.model

import javax.inject.Inject

class PetrolEngine : Engine {
    @Inject
    constructor() {

    }

    override fun start() {
        println("Petrol engine started ..")
    }

}