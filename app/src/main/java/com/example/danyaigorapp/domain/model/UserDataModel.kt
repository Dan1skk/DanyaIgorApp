package com.example.cleanarchitecture.domain.model

data class UserDataModel(
    val id: String = "",
    val name: String,
    val userName: String,
    val phone: String,
    val email: String,
    val status: String? = null,
    val earned: Int? = null,
    val rank: String? = null
)