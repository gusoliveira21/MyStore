package com.gusoliveira.domain.usecase

import com.gusoliveira.domain.entities.objectCategory.CategoryEntity
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductUseCase(private val myStoreRepository: MyStoreRepository): BaseUseCase<Nothing, List<List<Any>>>(){
    override suspend fun doWork(): List<List<Any>> {
        var allProducts = getAllProducts()
        var allCategory = HashSet(getAllCategory(allProducts)).toList()
        return listOf(allProducts,allCategory)
    }
    private suspend fun getAllProducts() = myStoreRepository.getProduct()

    private fun getAllCategory(allProducts: List<ProductEntity>):List<CategoryEntity> =
        allProducts.map { CategoryEntity(it.category)}.toMutableList()


}