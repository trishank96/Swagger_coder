package com.example.trishmuk.swagger_code.Services

import com.example.trishmuk.swagger_code.Models.Category
import com.example.trishmuk.swagger_code.Models.Product

object DataList {
    val categories = listOf(
            Category("Hats", "hatimage"),
            Category("Shirts", "shirtimage"),
            Category("Hoodies", "hoodieimage"),
            Category("Digital Goods", "digitalgoodsimage")
    )

    val Hats = listOf(
            Product("Black Beanie", "250rs", "hat1"),
            Product("Black Hat", "280rs", "hat2"),
            Product("White Hat", "280rs", "hat3"),
            Product("Black and Grey hat", "300rs", "hat4")
    )

    val Hoodie = listOf(
            Product("Black Hoodie", "350rs", "hoodie1"),
            Product("Maroon Hoodie", "350rs", "hoodie2"),
            Product("Grey Text Hoodie", "350rs", "hoodie3"),
            Product("Black Text Hoodie", "350rs", "hoodie4")
    )

    val Shirt = listOf(
            Product("Black Shirt", "280rs", "shirt1"),
            Product("Grey Shirt", "320rs", "shirt2"),
            Product("Maroon Shirt", "320rs", "shirt3"),
            Product("Black coder Shirt", "280rs", "shirt 4"),
            Product("Black ker Shirt", "280rs", "shirt5")
    )

    val DigitalGoods = listOf<Product>()

    fun getProduct(category: String): List<Product>{
        return when(category){
            "Hats" -> Hats
            "Shirts" -> Shirt
            "Hoodies" -> Hoodie
            else -> DigitalGoods
        }

    }
}