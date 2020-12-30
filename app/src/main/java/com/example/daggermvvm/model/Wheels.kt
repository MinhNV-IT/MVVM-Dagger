package com.example.daggermvvm.model

class Wheels {
    var rims: Rims
    var tires: Tires

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}
