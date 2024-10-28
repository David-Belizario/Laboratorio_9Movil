package com.androidcourse.laboratorio_9.Interface

import com.androidcourse.laboratorio_9.ViewModel.PostModel
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface PostApiService {
    @GET("posts")
    suspend fun getUserPosts(): List <PostModel>

    @GET("posts/{id}")
    suspend fun getUserPostById(@Path("id") id: Int): PostModel
}