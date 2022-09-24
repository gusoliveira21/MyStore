package com.gusoliveira.domain.usecase

import com.gusoliveira.domain.entities.Product
import com.gusoliveira.domain.repository.ProductRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductUseCase(private val productRepository: ProductRepository): BaseUseCase<Nothing, List<Product>>(){
    override suspend fun doWork(): List<Product> {
        TODO("Not yet implemented")
    }

}