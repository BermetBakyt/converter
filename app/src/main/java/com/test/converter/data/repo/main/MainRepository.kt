package com.test.converter.data.repo.main


import com.test.converter.data.models.CurrencyResponse
import com.test.converter.data.util.Resource

interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}