package com.example.sandy.kotlin_retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.sandy.kotlin_retrofit.Beans.TrainRouteBean
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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


            call.enqueue(object :Callback<TrainRouteBean>{
                override fun onFailure(call: Call<TrainRouteBean>?, t: Throwable?) {

                    Toast.makeText(this@MainActivity,"plz try again",Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<TrainRouteBean>?, response: Response<TrainRouteBean>?) {

                    var bean = response!!.body()
                    var list = mutableListOf<String>()

                    list.add("Train: "+bean!!.train.name)
                  //  list.add("Routes: "+bean!!.route)

                    var routes=bean.route
                    for (r in routes!!)
                    {
                        list.add("Cur Status : "+r.station.name)
                    }

                    var adapter=ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,list)
                    lv1.adapter=adapter


                }



            })
        }
    }
}
