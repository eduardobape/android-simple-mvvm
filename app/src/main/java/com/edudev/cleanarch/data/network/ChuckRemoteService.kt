package com.edudev.cleanarch.data.network

import com.edudev.cleanarch.data.model.ChuckQuote
import com.edudev.cleanarch.utils.RetrofitUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ChuckRemoteService {

    private val retrofit = RetrofitUtils.createRetrofit()

    suspend fun getRandomChuckQuote(): ChuckQuote? = withContext(Dispatchers.IO) {
        val response = retrofit.create(ChuckQuoteAPIClient::class.java).getRandomQuote()
        response.body()
    }
}