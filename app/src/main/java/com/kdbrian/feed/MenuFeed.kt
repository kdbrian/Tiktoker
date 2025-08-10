package com.kdbrian.feed

import android.app.Application
import com.kdbrian.feed.di.coreModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class MenuFeed : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())


        startKoin {
            androidContext(this@MenuFeed)
            androidLogger()

            modules(
                coreModules,
            )
        }


    }
}