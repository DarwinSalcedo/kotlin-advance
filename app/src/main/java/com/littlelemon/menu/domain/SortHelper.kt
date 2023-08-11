package com.littlelemon.menu.domain

import com.littlelemon.menu.data.ProductItem
import com.littlelemon.menu.data.SortType

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> TODO("create extension function for List<Product> with sorting based on price ascending")
            SortType.PriceDesc -> TODO("create extension function for List<Product> with sorting based on price descending")
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

}