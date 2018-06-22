package com.example.trishmuk.swagger_code.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.trishmuk.swagger_code.Adapters.CategoryAdapter
import com.example.trishmuk.swagger_code.Adapters.RecycleViewAdapter
import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Services.DataList
import com.example.trishmuk.swagger_code.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : RecycleViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = RecycleViewAdapter(this, DataList.categories) {category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListview.adapter = adapter

        val layoutMan = LinearLayoutManager(this)
        categoryListview.layoutManager = layoutMan
        categoryListview.setHasFixedSize(true)
    }
}
