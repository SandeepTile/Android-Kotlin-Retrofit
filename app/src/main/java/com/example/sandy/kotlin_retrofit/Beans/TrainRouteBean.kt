package com.example.sandy.kotlin_retrofit.Beans

data class TrainRouteBean(
        val train: Train,
        val route: List<Route>,
        val response_code: Int,
        val debit: Int
)