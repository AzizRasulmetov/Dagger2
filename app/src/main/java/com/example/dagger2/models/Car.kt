package com.example.dagger2.models

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine) {

    fun drive() {
        println("Car is driving with $engine")
    }

}