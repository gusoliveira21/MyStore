package com.gusoliveira.domain.usecase

import assertk.assertThat
import assertk.assertions.isEqualTo
import br.com.domain.MainCoroutineRule
import com.gusoliveira.domain.productData
import com.gusoliveira.domain.productExpected
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.product.GetAllProductsUseCase
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class GetAllProductsUseCaseTestEntity {
    @ExperimentalCoroutinesApi
    @get:Rule
    var coroutineTestRule = MainCoroutineRule()

    private val repository = mockk<MyStoreRepository>(relaxed = true)

    //Ao executar ele diz que nenhum teste foi encontrado
   /* @Test
    fun `checks if the return is a object`() = runBlocking {
        //arrange
        coEvery { repository.getAllProducts() } returns productData
        val getAllProductsUseCase = GetAllProductsUseCase(repository)

        //act
        val result = getAllProductsUseCase.execute()
        //val result = GetProductUseCase(repository)//getProductUseCase.execute()

        //assert TODO corrigir erro
        assertThat(result.success.data.first()).isEqualTo(productExpected)
    }*/
}