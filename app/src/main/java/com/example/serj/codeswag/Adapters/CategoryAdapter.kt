package com.example.serj.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.serj.codeswag.Model.Category
import com.example.serj.codeswag.R


//Creating the  basic adapder  from the  android  studio , in this  adapter  wil  passe the data
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories


//    i function that will shoe  how it  will apear  the  layout
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
//    Creating  the UI elements
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)

        categoryName.text = category.title
        return categoryView

    }

// returnig  the posistion where  will  bee the item
    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

//return ho many category  will be in array
    override fun getCount(): Int {
        return categories.count()
    }
}