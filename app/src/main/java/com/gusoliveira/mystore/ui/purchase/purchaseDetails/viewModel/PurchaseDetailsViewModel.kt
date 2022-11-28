package com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel

import androidx.lifecycle.ViewModel

abstract class PurchaseDetailsViewModel : ViewModel() {

    //meios de pagamento

    abstract fun confirmDeliveryAddress()
    abstract fun confirmCpf()
    abstract fun confirmPaymentMethod()
    abstract fun confirmPurchase()
}