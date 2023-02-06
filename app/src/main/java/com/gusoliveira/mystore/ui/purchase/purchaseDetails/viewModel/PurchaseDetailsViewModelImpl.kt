package com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gusoliveira.domain.entities.objectProduct.ListProductEntity
import com.gusoliveira.mystore.databinding.FragmentPurchaseDetailsBinding
import com.gusoliveira.mystore.ui.productDetails.ProductDetailsFragmentArgs
import com.gusoliveira.mystore.ui.purchase.purchaseDetails.PurchaseDetailsFragmentArgs
import com.gusoliveira.mystore.ui.router.Router

class PurchaseDetailsViewModelImpl(
    private val args: PurchaseDetailsFragmentArgs,
    private val router: Router
) : PurchaseDetailsViewModel() {

    override val productPurchase = MutableLiveData(args.listProduct)

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