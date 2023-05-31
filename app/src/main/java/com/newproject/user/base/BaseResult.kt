package com.munchngiveandroid.user.base

sealed class BaseResult <out T>{
    data class Success<out T> (val data:T?=null):BaseResult<T>()
    data class Loading (val nothing: Nothing?=null):BaseResult<Nothing>()
    data class Failed(val message:String?=null):BaseResult<Nothing>()
    data class Exception(val message: String?=null):BaseResult<Nothing>()
}