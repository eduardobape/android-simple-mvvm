package com.edudev.cleanarch.utils

import com.edudev.cleanarch.data.network.URLsChuckAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitUtils {

    fun createRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(URLsChuckAPI.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}