package com.example.serj.codeswag.Controler

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.serj.codeswag.Adapters.ProductAdapter
import com.example.serj.codeswag.R
import com.example.serj.codeswag.Services.DataService
import com.example.serj.codeswag.Utilites.EXTRA_CATEGORYES
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {


    lateinit var adapter: ProductAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORYES)

         adapter = ProductAdapter(this, DataService.getProducts(categoryType))

//        horisontall

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
//    check  divies  size

        val screeSize = resources.configuration.screenWidthDp
        if(screeSize >720 ){
            spanCount = 3
        }

//        ===================================
        val layoutmanager= GridLayoutManager(this,spanCount)
        productsListView.layoutManager =layoutmanager
        productsListView.adapter=adapter

    }
}
