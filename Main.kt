package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arr = ArrayList<String>()
        arr.add("BMI")
        arr.add("TIC TAC TOE")
        arr.add("Splash Screen")
        arr.add("ANIMATION's")
        arr.add("LIST_VIEW")
        arr.add("Card View")
        arr.add("Recycler View")
        arr.add("Toolbar")

        binding.recycler.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapterMainA(this, arr)
        binding.recycler.adapter = adapter

    }
}