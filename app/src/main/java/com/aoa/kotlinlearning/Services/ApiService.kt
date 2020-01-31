package com.aoa.kotlinlearning.Services

import com.aoa.kotlinlearning.Models.DogsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getCharacterByName(@Url url:String): Call<DogsResponse>
}