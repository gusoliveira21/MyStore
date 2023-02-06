package com.gusoliveira.mystore.ui.purchase.purchaseDetails.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gusoliveira.domain.entities.objectProduct.ListProductEntity
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProductPurchaseBinding

class PurchaseDetailsAdapter(private val productPurchaseList: ListProductEntity) :
    RecyclerView.Adapter<PurchaseDetailsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PurchaseDetailsViewHolder {
        return PurchaseDetailsViewHolder(
            ItemProductPurchaseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PurchaseDetailsViewHolder, position: Int) {
        holder.setupCardItemPurchase(productPurchaseList.listProduct[position])
    }

    override fun getItemCount() = productPurchaseList.listProduct.size
}
