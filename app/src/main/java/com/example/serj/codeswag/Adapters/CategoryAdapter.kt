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
        val categoryView: View
        val holder: ViewHolder
//if  the  is not  exist  the  holder  is  creating  this holder   and  after  taht is  inflating
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

//    Creating  the UI elements
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryImage = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder

        } else {
//else if  exist  we  will be reuse that  was  created befor
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
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

/* Creating  a ViewHolder  that  will  halp  to inflate
 and to reuse  the  items  when we wil
    scroll  down   this  class  wil hold the category image  and  category Name  */

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}