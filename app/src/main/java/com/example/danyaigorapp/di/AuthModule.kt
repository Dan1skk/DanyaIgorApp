package com.example.danyaigorapp.di


import com.example.cleanarchitecture.domain.repository.AuthRepository
import com.example.cleanarchitecture.domain.usecase.SignInUseCase
import com.example.cleanarchitecture.domain.usecase.SignUpUseCase
import com.example.danyaigorapp.data.repository.AuthRepositoryIml

import org.koin.dsl.module

val AuthModule = module{
    single<AuthRepository> { AuthRepositoryIml() }

    factory { SignUpUseCase(get())}
    factory { SignInUseCase(get()) }

}