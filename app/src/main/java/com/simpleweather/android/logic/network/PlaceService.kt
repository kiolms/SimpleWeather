package com.simpleweather.android.logic.network

import com.simpleweather.android.SimpleWeatherApplication
import com.simpleweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService{

    @GET("v2/place?token=${SimpleWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}