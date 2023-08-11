package com.littlelemon.menu.domain

import com.littlelemon.menu.data.ProductItem
import junit.framework.TestCase.assertEquals
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val mockDrawableResource = 1
        val expectedProduct = ProductItem(
            title = "Croissant",
            price = 7.00,
            category = "Dessert",
            mockDrawableResource
        )
        val sampleProductsList = mutableListOf(
            ProductItem(
                title = "Black tea",
                price = 3.00,
                category = "Drinks",
                mockDrawableResource
            ),
            expectedProduct,
            ProductItem(
                title = "Bouillabaisse",
                price = 20.00,
                category = "Food",
                mockDrawableResource
            )
        )

        val result = FilterHelper().filterProducts(
            FilterType.Dessert,
            sampleProductsList
        )

        assertEquals(expectedProduct.title, result.first().title)

    }
}