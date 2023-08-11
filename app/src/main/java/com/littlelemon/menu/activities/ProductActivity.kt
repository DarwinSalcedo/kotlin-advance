package com.littlelemon.menu.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.littlelemon.menu.ProductDetails
import com.littlelemon.menu.data.ProductItem

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productItem =
            ProductItem("", 0.0, "", -1)//todo replace with the passed values from intent
        setContent { ProductDetails(productItem) }
    }
}