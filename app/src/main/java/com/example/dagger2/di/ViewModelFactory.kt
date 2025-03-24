package com.example.dagger2.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2.data.Repository
import com.example.dagger2.network.ApiService
import com.example.dagger2.ui.MainViewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val repository: Repository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}