package com.raywenderlich.spacedaily.di

import com.raywenderlich.spacedaily.ActivityRetriever
import com.raywenderlich.spacedaily.DefaultCurrentActivityListener
import org.koin.dsl.module

val appmodule = module {

    single {
        DefaultCurrentActivityListener()
    }

    single {
        /* ActivityRetriever içine DefaultCurrentActivityListener alıyor
        Koin bunu önceden biliyor yukarıda tanımlı olduğu için
        */
        ActivityRetriever(get())
    }
}