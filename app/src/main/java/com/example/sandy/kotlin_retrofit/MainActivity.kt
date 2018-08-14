package com.example.sandy.kotlin_retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            var r = Retrofit.Builder().baseUrl("https://api.railwayapi.com/").
                    addConverterFactory(GsonConverterFactory.create()).
                    build()
            var api = r.create(TrainRouteAPI::class.java)
            var call = api.getRouteInfo()


        }
    }
}
