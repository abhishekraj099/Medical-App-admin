
package com.example.medicaladminapp.Api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val client: OkHttpClient = OkHttpClient.Builder().build()

    val api: API_Builder =
        Retrofit.Builder().client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(API_Builder::class.java)
}