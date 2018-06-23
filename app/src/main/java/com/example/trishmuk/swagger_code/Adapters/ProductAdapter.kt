package com.example.trishmuk.swagger_code.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.trishmuk.swagger_code.Adapters.ProductAdapter.ProductHolder
import com.example.trishmuk.swagger_code.Models.Product
import com.example.trishmuk.swagger_code.R

class ProductAdapter(val context: Context, val products: List<Product>, val onClick: (Product) -> Unit): RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view, onClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.onBindView(context,products[position])
    }

    inner class ProductHolder(itemView: View?, val onClick: (Product) -> Unit): RecyclerView.ViewHolder(itemView){
        val productsImage = itemView?.findViewById<ImageView>(R.id.products_image)
        val productsName = itemView?.findViewById<TextView>(R.id.product_name)
        val productsPrice = itemView?.findViewById<TextView>(R.id.product_price)

        fun onBindView(context: Context, product: Product){
            val resourceId = context.resources.getIdentifier(product.image,"drawable", context.packageName)

            productsImage?.setImageResource(resourceId)
            productsName?.text = product.title
            productsPrice?.text = product.price

            itemView.setOnClickListener {
                onClick(product)
            }
        }
    }
}