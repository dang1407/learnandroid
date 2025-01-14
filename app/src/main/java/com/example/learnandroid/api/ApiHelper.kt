package com.example.learnandroid.api

import com.example.learnandroid.model.ApiUser

interface ApiHelper {
    suspend fun getUsers(): List<ApiUser>

    suspend fun getMoreUsers(): List<ApiUser>

    suspend fun getUsersWithError(): List<ApiUser>
}