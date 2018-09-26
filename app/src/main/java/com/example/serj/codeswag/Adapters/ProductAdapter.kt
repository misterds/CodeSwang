package com.example.serj.codeswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.serj.codeswag.Model.Product
import com.example.serj.codeswag.R

class ProductAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProducHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProducHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProducHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProducHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

//    =====================================================


    inner class ProducHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourId)
            productName?.text = product.title
            productPrice?.text = product.price
        }

    }
}