<<<<<<<< HEAD:domain/src/main/java/com/gusoliveira/domain/usecase/product/GetCategoriesUseCase.kt
package com.gusoliveira.domain.usecase.product
========
package com.gusoliveira.domain.usecase.productMethods
>>>>>>>> main:domain/src/main/java/com/gusoliveira/domain/usecase/productMethods/GetCategoriesUseCase.kt

import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetCategoriesUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing, List<String>>() {
    override suspend fun doWork(value: Nothing?): List<String> {
        return myStoreRepository.getCategories()
    }
}