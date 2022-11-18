package com.gusoliveira.mystore.application

import android.app.Application
import com.gusoliveira.mystore.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyStoreApplicationKoin : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger()
            androidContext(this@MyStoreApplicationKoin)
            modules(mainModule)
        }
    }
}