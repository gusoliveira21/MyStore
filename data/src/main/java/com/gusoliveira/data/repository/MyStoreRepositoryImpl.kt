package com.gusoliveira.data.repository

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.domain.entities.Rating
import com.gusoliveira.domain.entities.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository

// TODO utilizar o padrão mapper aqui https://www.baeldung.com/kotlin/data-objects
class MyStoreRepositoryImpl(
    private val myStoreService: MyStoreService
) : MyStoreRepository {
    override suspend fun getProduct(): List<ProductEntity> {
        //TODO Funciona
        /*val list: MutableList<ProductItem> = mutableListOf()
        list.add(myStoreService.getAllProductsList())*/

        /**Precisa ser deste modo já que a lista será retornada sem nenhuma mudança
         * logo, o modelo de entrada também será o modelo de saída*/
        val listProducts = myStoreService.getAllProductsList()

        val listProductEntityDomain: MutableList<ProductEntity> = mutableListOf()

        listProducts.map { data ->
            listProductEntityDomain.add(
                ProductEntity(
                    id = data.id,
                    title = data.title,
                    price = data.price,
                    description = data.description,
                    category = data.category,
                    image = data.image,
                    Rating(
                        rate = data.rating.rate,
                        count = data.rating.count
                    )
                )
            )
        }
        //TODO ArrayList<ProductItemItem>()
        //TODO listOf(ProductEntity())

        /*        val list2 = listOf(
            ProductEntity(
                id = 1,
                title = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
                price = 109.5,
                description = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
                category = "men's clothing",
                image = "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
                Rating(
                    rate = 3.9,
                    count = 120
                )
            )
        )*/

        return listProductEntityDomain
    }
}