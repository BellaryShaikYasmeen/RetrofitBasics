package com.example.retrofitbasics

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val baseurl="https://quotable.io/"
    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}