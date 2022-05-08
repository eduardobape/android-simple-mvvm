package com.edudev.cleanarch.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edudev.cleanarch.data.model.ChuckQuote
import com.edudev.cleanarch.domain.ChuckRandomQuoteUserCase
import kotlinx.coroutines.launch

class ChuckQuoteViewModel : ViewModel() {

    val chuckQuote: MutableLiveData<ChuckQuote?> by lazy {
        MutableLiveData<ChuckQuote?>()
    }
    private val chuckRandomQuoteUserCase = ChuckRandomQuoteUserCase()

    fun getRandomChuckQuote() {
        viewModelScope.launch {
            chuckQuote.postValue(chuckRandomQuoteUserCase())
        }
    }
}