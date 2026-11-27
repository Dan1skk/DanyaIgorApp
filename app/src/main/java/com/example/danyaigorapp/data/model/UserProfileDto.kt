package com.example.danyaigorapp.data.model

import kotlinx.serialization.Serializable

@Serializable
data class UserProfileDto (
    val id: String = "",
    val name: String,
    val userName: String,
    val phone: String,
    val email: String
)