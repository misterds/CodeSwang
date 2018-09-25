package com.example.serj.codeswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.example.serj.codeswag.Model.Category
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



//Creating adapter
    lateinit var adapter :ArrayAdapter<Category>
//--------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//--------------------------------------------------------
//initialise  adapter

     adapter = ArrayAdapter(this,
             android.R.layout.simple_list_item_1,
             DataService.category)

//setup the list View
    categoryListView.adapter = adapter

    }
}
