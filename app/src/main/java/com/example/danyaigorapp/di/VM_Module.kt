package com.example.danyaigorapp.di

import com.example.danyaigorapp.feature.signin.LoginVM
import com.example.danyaigorapp.feature.singup.presentation.CreateAccountVM
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val VM_Module = module {
    viewModelOf(::CreateAccountVM)
    viewModelOf(::LoginVM)
}