package com.example.hiltdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier


@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {
    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class BindGasEngine

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class BindElectricEngine

    @BindGasEngine
    @Binds
    abstract fun bindEngine(gasEngine: GasEngine): Engine


    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(electricEngine: ElectricEngine): Engine

}