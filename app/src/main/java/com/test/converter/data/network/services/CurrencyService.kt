package com.test.converter.data.network.services

import com.test.converter.app.presentation.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyService {

    @GET("latest")
    suspend fun fetchRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>

}