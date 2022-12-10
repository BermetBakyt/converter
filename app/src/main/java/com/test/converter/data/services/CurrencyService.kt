package com.test.converter.data.services

import com.test.converter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyService {

    @GET("/latest?access_key=eUPMAjV82HlG5FJ8deSCglpNUlWvZYuP")
    suspend fun fetchRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}