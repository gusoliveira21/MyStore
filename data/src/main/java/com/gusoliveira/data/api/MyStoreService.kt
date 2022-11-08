package com.gusoliveira.data.api

import com.gusoliveira.data.model.ItemProduct
import com.gusoliveira.data.model.Products
import retrofit2.http.GET



interface MyStoreService {
    //TODO Ao invez do ItemProduct (modelo da camada Data), não posso usar ProductEntity (modelo da camada domain)? devido a elas serem iguais
    //TODO O jeito que foi declarado List<ItemProduct> a baixo ta correto? pode ser feito assim?
    /**
    O que é mais eficiente ou mis válido? pegar todos os produtos como feito a baixo, ou
    pegar os produtos de cada categoria somente quando me mover pelos pages?
    */
    @GET("products")
    suspend fun getAllProductsList(): List<ItemProduct>

    @GET("products/categories")
    suspend fun getCategoriesList(): List<String>
}