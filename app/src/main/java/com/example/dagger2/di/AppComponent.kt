package com.example.dagger2.di

import com.example.dagger2.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun inject(activity: MainActivity) //Define where to inject dependencies

}