package com.example.learnandroid.function

import com.example.learnandroid.api.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val apiService = RetrofitBuilder.apiService
    val users = apiService.getUsers()
    if(users.isNotEmpty()) {
        println(users[0])
    }
}