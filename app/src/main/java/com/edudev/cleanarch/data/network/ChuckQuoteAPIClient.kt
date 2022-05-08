package com.edudev.cleanarch.data.network

import com.edudev.cleanarch.data.model.ChuckQuote
import retrofit2.Response
import retrofit2.http.GET

interface ChuckQuoteAPIClient {

    @GET("random")
    suspend fun getRandomQuote(): Response<ChuckQuote>
}