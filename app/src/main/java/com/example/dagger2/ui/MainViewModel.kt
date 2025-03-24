package com.example.dagger2.ui

import androidx.lifecycle.ViewModel
import com.example.dagger2.data.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {


    fun getUserName(): String {
        return repository.getUserName()
    }


}