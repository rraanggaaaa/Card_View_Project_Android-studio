package com.example.cardviewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate (savedInstanceState: Bundle?)
    {
        super.onCreate (savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)

        populateMovies ()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter (movieList, mainActivity)
        }
    }

    override fun onClick(movie: Movie)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_ID_EXTRA, movie.id)
        startActivity(intent)
    }
    private fun populateMovies()
    {
        val movie1 = Movie(
            R.drawable.wanda,
            "Action, Adventure",
            "Wanda",
            "Deskripsi Wanda"
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.ironman,
            "Adventure, Drama",
            "Ironman",
            "Deskripsi Ironmamn"
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.hulk,
            "Romance, Drama",
            "Hulk",
            "Deskripsi Hulk"
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.camerica,
            "Drama",
            "Captain America",
            "Deskripsi Captain America"
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.thor,
            "Fantasy, Adventure",
            "Thor",
            "Deskripsi Hulk"
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.blackwidow,
            "Fantasy, Drama",
            "Black Widow",
            "Deskripsi Black Widow"
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.spiderman,
            "Drama, Fantasy, Family",
            "Spiderman",
            "Deskripsi Spiderman"
        )
        movieList.add(movie7)

        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)
        movieList.add(movie6)
        movieList.add(movie7)
    }
}


