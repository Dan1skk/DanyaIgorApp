package com.example.networklayer

import java.net.SocketTimeoutException
import java.net.UnknownHostException

class NetworkErrorHandler{
    fun handleError(throwable: Throwable) : String{
        return when(throwable){
            is UnknownHostException -> "Нет подключения к интернету."
            is SocketTimeoutException -> "Сервер не отвечает. Попрбудет позже"
            else -> "Ошибка сети: ${throwable.localizedMessage}"
        }
    }
}