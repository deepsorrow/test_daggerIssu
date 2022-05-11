package com.example.myapplication.di

import com.example.myapplication.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun injectMainActivity(): MainActivity
}