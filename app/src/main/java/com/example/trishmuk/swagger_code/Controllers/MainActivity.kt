package com.example.trishmuk.swagger_code.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.trishmuk.swagger_code.Adapters.CategoryAdapter
import com.example.trishmuk.swagger_code.Adapters.RecycleViewAdapter
import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Services.DataList
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : RecycleViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = RecycleViewAdapter(this, DataList.categories)
        categoryListview.adapter = adapter

        val layoutMan = LinearLayoutManager(this)
        categoryListview.layoutManager = layoutMan
        categoryListview.setHasFixedSize(true)
    }
}
