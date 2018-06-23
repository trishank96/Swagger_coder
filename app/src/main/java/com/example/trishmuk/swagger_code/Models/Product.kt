package com.example.trishmuk.swagger_code.Models

class Product constructor(val title: String, val price: String, val image :String){
    override fun toString(): String {
        return title
    }
}