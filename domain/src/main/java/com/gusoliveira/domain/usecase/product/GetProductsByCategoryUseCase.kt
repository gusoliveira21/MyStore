package com.gusoliveira.domain.usecase.product

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductsByCategoryUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<String, List<ProductEntity>>() {

    override suspend fun doWork(value: String?): List<ProductEntity> {
        return if (value != null) {
            myStoreRepository.getProductsByCategory(value)
        } else {
            //TODO: é uma boa prática? se não, o que fazer?
            listOf()
        }
    }
}
