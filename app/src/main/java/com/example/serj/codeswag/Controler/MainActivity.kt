package com.example.serj.codeswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.serj.codeswag.Adapters.CategoryRecyclerAdapter
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



//Creating adapter
    lateinit var adapter : CategoryRecyclerAdapter
//--------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//--------------------------------------------------------
//initialise  adapter

     adapter = CategoryRecyclerAdapter(this,DataService.category)
//setup the list View
    categoryListView.adapter = adapter

    val layoutManager = LinearLayoutManager(this)
    categoryListView.layoutManager = layoutManager
    categoryListView.setHasFixedSize(true)


    }
}
