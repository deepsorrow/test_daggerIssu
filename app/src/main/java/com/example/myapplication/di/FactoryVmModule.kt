package com.example.myapplication.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.MainActivity
import com.example.myapplication.TestVM
import com.example.myapplication.di.vm.ViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class FactoryVmModule {

    @Provides
    @Named("TestVM")
    fun provideTestVM(
        activity: MainActivity,
        viewModelFactory: ViewModelFactory
    ): TestVM =
        ViewModelProvider(activity, viewModelFactory)[TestVM::class.java]

}