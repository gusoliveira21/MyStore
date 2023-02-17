package com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gusoliveira.domain.entities.objectProduct.ListProductEntity
import com.gusoliveira.mystore.databinding.FragmentPurchaseDetailsBinding
import com.gusoliveira.mystore.ui.productDetails.ProductDetailsFragmentArgs

abstract class PurchaseDetailsViewModel : ViewModel() {

    abstract val productPurchase: LiveData<ListProductEntity>

    abstract val productTotalValue: LiveData<Double>
    abstract fun confirmDeliveryAddress()
    abstract fun confirmCpf()
    abstract fun confirmPaymentMethod()
    abstract fun confirmPurchase()
}