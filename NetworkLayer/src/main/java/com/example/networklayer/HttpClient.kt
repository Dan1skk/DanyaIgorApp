package com.example.networklayer

interface HttpClient{
    suspend fun get(url: String) : String
    suspend fun post(url: String, body: String) : String
}