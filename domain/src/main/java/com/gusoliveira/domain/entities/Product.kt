package com.gusoliveira.domain.entities

import java.text.DecimalFormat

data class Product(
    var id:String,
    var title:String,
    var price:DecimalFormat,
    var description: String,
    var category:String,
    var image:String,
    var rating:Rating
    )
