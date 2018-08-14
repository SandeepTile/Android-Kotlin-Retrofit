package com.example.sandy.kotlin_retrofit.Beans

data class Train(
        val days: List<Day>,
        val classes: List<Classe>,
        val name: String,
        val number: String
)