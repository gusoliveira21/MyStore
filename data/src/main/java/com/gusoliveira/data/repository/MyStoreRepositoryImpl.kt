package com.gusoliveira.data.repository

import android.util.Log
import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.model.Product
import com.gusoliveira.domain.entities.ProductEntity
import com.gusoliveira.domain.entities.Rating
import com.gusoliveira.domain.repository.MyStoreRepository
import org.junit.runner.manipulation.Ordering.Context

// TODO utilizar o padrão mapper aqui https://www.baeldung.com/kotlin/data-objects
class MyStoreRepositoryImpl(
    private val myStoreService: MyStoreService) :
    MyStoreRepository {
    override suspend fun getProduct(): List<ProductEntity> {
        val list: MutableList<ProductEntity> = mutableListOf()
        myStoreService.getAllProductsList().data.forEach { data ->
            list.add(
                ProductEntity(
                    id = data.id,
                    title = data.title,
                    price = data.price,
                    description = data.description,
                    category = data.category,
                    image = data.image,
                    Rating(
                        count = data.rating.count,
                        rate = data.rating.rate
                    )
                )
            )
        }
        return list
    }
}