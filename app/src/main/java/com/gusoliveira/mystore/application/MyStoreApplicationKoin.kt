package com.gusoliveira.mystore.application

import android.app.Application
import com.gusoliveira.mystore.BuildConfig
import com.gusoliveira.mystore.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber
import timber.log.Timber.DebugTree


class MyStoreApplicationKoin : Application() {
    override fun onCreate() {
        super.onCreate()
        setupTimber()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger()
            androidContext(this@MyStoreApplicationKoin)
            modules(mainModule)
        }
    }

    private fun setupTimber(){
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}