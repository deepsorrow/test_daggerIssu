package com.example.myapplication.di

import com.example.myapplication.TestApplication
import com.example.myapplication.di.vm.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, MainActivityModule::class, ViewModelModule::class, FactoryVmModule::class])
interface AppComponent {
    fun inject(application: TestApplication)
}