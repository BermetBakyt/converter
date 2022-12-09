package com.test.converter.data.repo.main

import com.test.converter.data.models.CurrencyResponse
import com.test.converter.data.services.CurrencyService
import com.test.converter.data.util.Resource
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: CurrencyService
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.fetchRates(base)
            val result = response.body()
            if(response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch(e: java.lang.Exception) {
            Resource.Error(e.message ?: " An error occured")
        }
    }
}