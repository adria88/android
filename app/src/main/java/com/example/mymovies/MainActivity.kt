package com.example.mymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mymovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcycler.adapter = MoviesAdapter(
                listOf(
                    Movie(title = "Title 1", cover = "https://loremflickr.com/320/240/cat?lock=1"),
                    Movie(title = "Title 2", cover = "https://loremflickr.com/320/240/cat?lock=2"),
                    Movie(title = "Title 3", cover = "https://loremflickr.com/320/240/cat?lock=8"),
                    Movie(title = "Title 4", cover = "https://loremflickr.com/320/240/cat?lock=10"),
                    Movie(title = "Title 5", cover = "https://loremflickr.com/320/240/cat?lock=20"),
                    Movie(title = "Title 6", cover = "https://loremflickr.com/320/240/cat?lock=11"),
                )
        )
                { movie ->
                    Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()

                }
    }



    override fun onDestroy() {
        super.onDestroy()

        Log.d("MainActivity","onDestroy")

    }
}