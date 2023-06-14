package com.example.moviecatalog.api

import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MovieApi {
    companion object {
        //    var BASE_URL = "http://10.0.2.2:3001"
        val BASE_URL = "https://api.themoviedb.org/"
        var retrofit : Retrofit? = null

        fun getInstance(): Retrofit{
            if(retrofit == null) {
                retrofit = Retrofit
                    .Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                //.create(UserApi::class.java)
            }

            return retrofit!!
        }
    }
}
