package com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel

import com.gusoliveira.mystore.ui.productDetails.ProductDetailsFragmentArgs
import com.gusoliveira.mystore.ui.router.Router

class PurchaseDetailsViewModelImpl(
    private val args: ProductDetailsFragmentArgs,
    private val router: Router
) : PurchaseDetailsViewModel() {
    init{

    }

    override fun confirmDeliveryAddress() {
        TODO("Not yet implemented")
    }

    override fun confirmCpf() {
        TODO("Not yet implemented")
    }

    override fun confirmPaymentMethod() {
        TODO("Not yet implemented")
    }

    override fun confirmPurchase() {
        TODO("Not yet implemented")
    }
}