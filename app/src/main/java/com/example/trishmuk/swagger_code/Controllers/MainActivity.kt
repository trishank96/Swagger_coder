package com.example.trishmuk.swagger_code.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Services.DataList
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(this,
                android.R.layout.simple_dropdown_item_1line,
                DataList.categories)
        categoryListview.adapter = adapter
    }
}
