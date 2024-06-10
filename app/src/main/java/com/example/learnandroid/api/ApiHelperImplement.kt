package com.example.learnandroid.api

import com.example.learnandroid.model.ApiUser

class ApiHelperImplement (private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<ApiUser>  = apiService.getUsers()


    override suspend fun getMoreUsers(): List<ApiUser>  = apiService.getMoreUsers()

    override suspend fun getUsersWithError(): List<ApiUser> = apiService.getUsersWithError()

}