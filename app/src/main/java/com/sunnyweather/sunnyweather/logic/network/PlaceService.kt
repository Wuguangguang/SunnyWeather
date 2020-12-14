package com.sunnyweather.sunnyweather.logic.network

import com.sunnyweather.sunnyweather.SunnyWeatherApplication
import com.sunnyweather.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh-CN")
    fun searchPlaces(@Query("query") query : String) : Call<PlaceResponse>
}