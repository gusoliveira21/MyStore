package com.gusoliveira.domain.usecase.product

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductsByCategoryUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing, List<ProductEntity>>() {
    override suspend fun doWork(category: String): List<ProductEntity> {
        return myStoreRepository.getProductsByCategory(category)
    }


}