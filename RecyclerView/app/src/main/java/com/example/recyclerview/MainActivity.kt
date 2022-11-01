package com.example.recyclerview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.MainRvItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : MainRvAdapter
    private lateinit var binding: ActivityMainBinding

    private var dogList = arrayListOf(
        Dog("Chow Chow", "Male", "4"),
        Dog("Breed Pomeranian", "Female", "1"),
        Dog("Golden Retriver", "Female", "3"),
        Dog("Yorkshire Terrier", "Male", "5"),
        Dog("Pug", "Male", "4"),
        Dog("Alaskan Malamute", "Male", "7"),
        Dog("Shih Tzu", "Female", "5")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MainRvAdapter(dogList)
        binding.mRecyclerView.adapter = adapter
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)

    }

}