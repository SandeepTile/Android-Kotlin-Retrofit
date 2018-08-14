package com.example.sandy.kotlin_retrofit

import com.example.sandy.kotlin_retrofit.Beans.TrainRouteBean
import retrofit2.Call
import retrofit2.http.GET

interface TrainRouteAPI {

    @GET("v2/route/train/57548/apikey/7opzpsj744/")

    fun getRouteInfo():Call<TrainRouteBean>

}