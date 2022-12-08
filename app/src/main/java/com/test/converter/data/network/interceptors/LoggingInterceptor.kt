package com.test.converter.data.network.interceptors

import okhttp3.logging.HttpLoggingInterceptor

class LoggingInterceptor {

    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }
}