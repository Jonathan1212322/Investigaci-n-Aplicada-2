package com.example.myapi

import retrofit2.http.GET

interface ApiService {
    @GET("endpoint")
    suspend fun getItems(): List<Item>
}