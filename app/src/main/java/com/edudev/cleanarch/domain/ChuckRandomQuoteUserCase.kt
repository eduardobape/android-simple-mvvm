package com.edudev.cleanarch.domain

import com.edudev.cleanarch.data.model.ChuckQuote
import com.edudev.cleanarch.data.repository.ChuckQuoteRepository

class ChuckRandomQuoteUserCase {

    private val chuckQuoteRepository = ChuckQuoteRepository()

    suspend operator fun invoke(): ChuckQuote? = chuckQuoteRepository.getRandomChuckQuote()
}