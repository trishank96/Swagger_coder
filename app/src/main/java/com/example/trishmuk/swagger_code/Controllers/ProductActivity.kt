package com.example.trishmuk.swagger_code.Controllers

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Adapter
import com.example.trishmuk.swagger_code.Adapters.ProductAdapter
import com.example.trishmuk.swagger_code.Models.Product
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Services.DataList
import com.example.trishmuk.swagger_code.Utilities.EXTRA_CATEGORY
import com.example.trishmuk.swagger_code.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, DataList.getProduct(categoryType)){
            val itemIntent = Intent(this, ItemActivity::class.java)
            itemIntent.putExtra(EXTRA_PRODUCT, it)
            startActivity(itemIntent)
        }
        productListview.adapter = adapter

        val orientation = resources.configuration.orientation
        var spanCount = 2
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val layoutman = GridLayoutManager(this, spanCount)
        productListview.layoutManager = layoutman

    }
}


