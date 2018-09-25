package com.example.serj.codeswag.Controler

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.serj.codeswag.Adapters.CategoryRecyclerAdapter
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Services.DataService
import com.example.serj.codeswag.Utilites.EXTRA_CATEGORYES
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

     adapter = CategoryRecyclerAdapter(this,DataService.category){
         category ->
         val productIntent =  Intent(this,ProductsActivity::class.java)
         productIntent.putExtra(EXTRA_CATEGORYES,category.title)
         startActivity(productIntent)
     }
//setup the list View
    categoryListView.adapter = adapter

    val layoutManager = LinearLayoutManager(this)
    categoryListView.layoutManager = layoutManager
    categoryListView.setHasFixedSize(true)
//creating  ower the  onclilistner

    }
}
