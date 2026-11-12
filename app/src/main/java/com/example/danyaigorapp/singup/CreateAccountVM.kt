package com.example.danyaigorapp.singup

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CreateAccountVM() : ViewModel() {

    private val _state = MutableStateFlow(CreateAccountState())
    val state = _state.asStateFlow()

    fun Full_Nmae(
        newusername: String
    ){
        _state.update {
            it.copy(full_name = newusername)
        }
    }

    fun User_Nmae(
        newusername: String
    ){
        _state.update {
            it.copy(user_name = newusername)
        }
    }

    fun Phone(
        newphone: String
    ){
        _state.update {
            it.copy(phone = newphone)
        }
    }

    fun Email(
        newemail: String
    ){
        _state.update {
            it.copy(email = newemail)
        }
    }

    fun Password(
        newpassword: String
    ){
        _state.update {
            it.copy(password = newpassword)
        }
    }

    fun Conf_Password(
        newconfpassword: String
    ){
        _state.update {
            it.copy(conf_password = newconfpassword)
        }
    }
}