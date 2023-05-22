package com.example.a5moth_leson2

import com.example.a2monthlesson2.LoveApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoveService {

    private val retrofit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(LoveApi::class.java)
}