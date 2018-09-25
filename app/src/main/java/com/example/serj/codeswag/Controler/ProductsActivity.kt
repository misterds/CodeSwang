package com.example.serj.codeswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Utilites.EXTRA_CATEGORYES

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORYES)
        println(categoryType)
    }
}
