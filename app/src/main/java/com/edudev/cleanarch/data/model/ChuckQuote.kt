package com.edudev.cleanarch.data.model

import com.google.gson.annotations.SerializedName

data class ChuckQuote(
    @SerializedName("value")
    val quoteText: String
)

fun ChuckQuote.sanitized(): String = quoteText.trim().replaceFirstChar { it.uppercase() }
