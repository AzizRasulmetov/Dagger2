package com.example.dagger2.network

import retrofit2.http.GET

interface ApiService {

    @GET
    fun getUserName(): String

}