package com.example.hiltdemo

import javax.inject.Inject

class Truck @Inject constructor(val driver: Driver) {
    @EngineModule.BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @EngineModule.BindElectricEngine
    @Inject
    lateinit var electricengine: Engine
    fun deliver() {
        gasEngine.start()
        electricengine.start()

        println("Truck is delivering cargo. Driven by $driver")

        electricengine.shutdown()
        gasEngine.shutdown()
    }


}


class Driver @Inject constructor() {


}