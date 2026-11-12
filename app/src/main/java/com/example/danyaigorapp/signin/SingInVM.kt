package com.example.danyaigorapp.signin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SingInVM() : ViewModel() {

    private val _state = MutableStateFlow(SingInState())
    val state = _state.asStateFlow()

    fun EmailUpdate(
        newemail: String
    ){
        _state.update {
            it.copy(email = newemail)
        }
    }

    fun PasswordUpdate(
        newpassword: String
    ){
        _state.update {
            it.copy(pass = newpassword)
        }
    }



}