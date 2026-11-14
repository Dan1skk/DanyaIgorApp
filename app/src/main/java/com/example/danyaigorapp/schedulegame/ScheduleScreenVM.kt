package com.example.danyaigorapp.schedulegame

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ScheduleScreenVM() : ViewModel() {

    private val _state = MutableStateFlow(ScheduleScreenState())
    val state = _state.asStateFlow()

    fun Game_Name(
        newgamename: String
    ){
        _state.update {
            it.copy(game_name = newgamename)
        }
    }

    fun Category(
        newcategory: String
    ){
        _state.update {
            it.copy(category = newcategory)
        }
    }

    fun Winning_Price(
        newwinningprice: String
    ){
        _state.update {
            it.copy(winning_price = newwinningprice)
        }
    }

    fun Description(
        newdescription: String
    ){
        _state.update {
            it.copy(description = newdescription)
        }
    }
}