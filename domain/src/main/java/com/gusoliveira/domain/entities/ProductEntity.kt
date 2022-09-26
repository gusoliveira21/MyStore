package com.gusoliveira.domain.entities

import java.text.DecimalFormat

data class ProductEntity(
    var id:Int,
    var title:String,
    var price: DecimalFormat,
    var description: String,
    var category:String,
    var image:String,
    var rating:Rating
    )
