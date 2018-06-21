package com.example.trishmuk.swagger_code.Adapters


import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.trishmuk.swagger_code.Adapters.RecycleViewAdapter.Holder
import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.R

class RecycleViewAdapter(val context: Context, val categories: List<Category>): RecyclerView.Adapter<Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindViews(context, categories[position])
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val categoryImage= itemView?.findViewById<ImageView>(R.id.CategoryImage)
        val categoryName= itemView?.findViewById<TextView>(R.id.CategoryName)

        fun bindViews (context: Context, category: Category){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}