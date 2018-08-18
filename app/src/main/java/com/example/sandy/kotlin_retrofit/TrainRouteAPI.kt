package com.example.sandy.kotlin_retrofit

import android.widget.EditText
import com.example.sandy.kotlin_retrofit.Beans.TrainRouteBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TrainRouteAPI {

    @GET("v2/route/train/{trainno}/apikey/7opzpsj744/")

    fun getRouteInfo(@Path("trainno")t:String):Call<TrainRouteBean>  //parameter and value must be same

}