package com.example.dagger2.data

import com.example.dagger2.network.ApiService
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {

    fun getUserName(): String {
        // Fake result
        return "Azizbek Rasulmetov"
    }



}