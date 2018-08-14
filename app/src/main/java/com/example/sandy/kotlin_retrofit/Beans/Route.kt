package com.example.sandy.kotlin_retrofit.Beans

data class Route(
        val station: Station,
        val schdep: String,
        val day: Int,
        val halt: Int,
        val distance: Int,
        val scharr: String,
        val no: Int
)

