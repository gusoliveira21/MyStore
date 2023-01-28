<<<<<<<< HEAD:domain/src/main/java/com/gusoliveira/domain/usecase/product/GetAllProductsUseCase.kt
package com.gusoliveira.domain.usecase.product
========
package com.gusoliveira.domain.usecase.productMethods
>>>>>>>> main:domain/src/main/java/com/gusoliveira/domain/usecase/productMethods/GetAllProductsUseCase.kt

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetAllProductsUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing?, List<ProductEntity>>() {

    override suspend fun doWork(value: Nothing?): List<ProductEntity> {
        return myStoreRepository.getAllProducts()
    }
}