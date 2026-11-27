package com.example.danyaigorapp.feature.singup.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture.domain.usecase.SignUpUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CreateAccountVM(
    private val signUpUseCase: SignUpUseCase
) : ViewModel() {

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

    fun PasswordUpdate(
        newpassword: String
    ){
        _state.update {
            it.copy(password = newpassword)
        }
    }

    fun Conf_PasswordUpdate(
        newconfpassword: String
    ){
        _state.update {
            it.copy(conf_password = newconfpassword)
        }
    }

    fun onSignUpClick() {
        val current = _state.value
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, errorMessage = null) }
            try {
                signUpUseCase(
                    fullName = current.full_name,
                    userName = current.user_name,
                    phone = current.phone,
                    email = current.email,
                    password = current.password,
                    confirmPassword = current.conf_password
                )
                _state.update { it.copy(isLoading = false, isSuccess = true) }
            } catch (e: Exception) {
                _state.update { it.copy(isLoading = false, errorMessage = e.message) }
            }
        }
    }
}