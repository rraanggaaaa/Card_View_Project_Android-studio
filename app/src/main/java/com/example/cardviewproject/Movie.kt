package com.example.cardviewproject

var movieList = mutableListOf<Movie>()
val MOVIE_ID_EXTRA = "movieExtra"

class Movie (
    var cover: Int,
    var genre: String,
    var title: String,
    var description: String,
    val id:Int? = movieList.size
)