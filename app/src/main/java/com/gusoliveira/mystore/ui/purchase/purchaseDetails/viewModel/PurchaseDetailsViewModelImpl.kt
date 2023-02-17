package com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel

import androidx.lifecycle.MutableLiveData
import com.gusoliveira.mystore.ui.purchase.purchaseDetails.PurchaseDetailsFragmentArgs
import com.gusoliveira.mystore.ui.router.Router
import com.gusoliveira.mystore.util.formatCurrency.Format

class PurchaseDetailsViewModelImpl(
    private val args: PurchaseDetailsFragmentArgs,
    private val router: Router
) : PurchaseDetailsViewModel() {

    override val productPurchase = MutableLiveData(args.shoppingBasket)

    override val productTotalValue: MutableLiveData<Double>
        get() = MutableLiveData<Double>().apply {
            value = args.shoppingBasket.listProduct.sumOf { it.price }
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