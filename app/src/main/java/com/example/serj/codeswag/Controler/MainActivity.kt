package com.example.serj.codeswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.serj.codeswag.Adapters.CategoryAdapter
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



//Creating adapter
    lateinit var adapter :CategoryAdapter
//--------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//--------------------------------------------------------
//initialise  adapter

     adapter = CategoryAdapter(this,DataService.category)
//setup the list View
    categoryListView.adapter = adapter

    }
}
