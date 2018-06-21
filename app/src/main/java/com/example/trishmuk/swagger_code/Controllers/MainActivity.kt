package com.example.trishmuk.swagger_code.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.trishmuk.swagger_code.Adapters.CategoryAdapter
import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Services.DataList
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,
                DataList.categories)
        categoryListview.adapter = adapter
    }
}
