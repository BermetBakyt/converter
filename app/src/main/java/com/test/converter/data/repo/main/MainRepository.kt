package com.test.converter.data.repo.main

import com.test.converter.app.presentation.models.CurrencyResponse
import retrofit2.Response

interface MainRepository {

    suspend fun getRates(base: String) : Response<CurrencyResponse>
}