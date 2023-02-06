package com.gusoliveira.domain.entities.objectProduct

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListProductEntity(
    var listProduct: List<ProductEntity>
) : Parcelable
