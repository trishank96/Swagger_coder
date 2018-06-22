package com.example.trishmuk.swagger_code.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
