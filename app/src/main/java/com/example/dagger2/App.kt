package com.example.dagger2

import android.app.Application
import com.example.dagger2.di.AppComponent
import com.example.dagger2.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
    }

}