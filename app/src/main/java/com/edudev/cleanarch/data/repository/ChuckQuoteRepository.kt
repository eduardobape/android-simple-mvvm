package com.edudev.cleanarch.data.repository

import com.edudev.cleanarch.data.model.ChuckQuote
import com.edudev.cleanarch.data.network.ChuckRemoteService

class ChuckQuoteRepository {

    private val remoteService = ChuckRemoteService()

    suspend fun getRandomChuckQuote(): ChuckQuote? = remoteService.getRandomChuckQuote()
}