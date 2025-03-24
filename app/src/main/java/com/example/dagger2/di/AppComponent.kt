package com.example.dagger2.di

import com.example.dagger2.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity) //Define where to inject dependencies

    fun viewModelsFactory(): ViewModelFactory

}