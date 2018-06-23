package com.example.trishmuk.swagger_code.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.trishmuk.swagger_code.Models.Product
import com.example.trishmuk.swagger_code.R
import com.example.trishmuk.swagger_code.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable",packageName)
        item_image.setImageResource(resourceId)
        item_name.text = product.title
        item_price.text = product.price
    }
}
