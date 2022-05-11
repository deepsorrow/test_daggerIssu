package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.DaggerAppComponent

import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector

import javax.inject.Inject

class TestApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)
    }

    override fun androidInjector() = dispatchingAndroidInjector
}