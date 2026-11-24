package com.example.networklayer

import java.util.concurrent.TimeUnit
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService{
    @GET
    suspend fun getData(@Url url: String) : String

}

class RetrofitClient(
    private val errorHandler: NetworkErrorHandler
) : HttpClient{
    private val client = OkHttpClient.Builder()
        .connectTimeout(ApiConfig.TIMEOUT, TimeUnit.SECONDS)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(ApiConfig.BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(ApiService::class.java)

    override suspend fun get(url: String): String {
        return try {
            apiService.getData(url)
        } catch (e: Exception){
            throw Exception(errorHandler.handleError(e))
        }
    }

    override suspend fun post(url: String, body: String) : String{
        return try{
            "POST запрос на $url с телом $body (заглушка)"
        } catch (e: Exception){
            throw Exception(errorHandler.handleError(e))
        }
    }
}