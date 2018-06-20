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
            Product("Black Beanie", "250rs", "hat01"),
            Product("Black Hat", "280rs", "hat02"),
            Product("White Hat", "280rs", "hat03"),
            Product("Black and Grey hat", "300rs", "hat04")
    )

    val Hoodie = listOf(
            Product("Black Hoodie", "350rs", "hoodie01"),
            Product("Maroon Hoodie", "350rs", "hoodie02"),
            Product("Grey Text Hoodie", "350rs", "hoodie03"),
            Product("Black Text Hoodie", "350rs", "hoodie04")
    )

    val Shirt = listOf(
            Product("Black Shirt", "280rs", "shirt01"),
            Product("Grey Shirt", "320rs", "shirt02"),
            Product("Maroon Shirt", "320rs", "shirt03"),
            Product("Black coder Shirt", "280rs", "shirt 04"),
            Product("Black ker Shirt", "280rs", "shirt05")
    )
}