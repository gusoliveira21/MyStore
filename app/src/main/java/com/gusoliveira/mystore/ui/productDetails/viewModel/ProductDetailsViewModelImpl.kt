package com.gusoliveira.mystore.ui.productDetails.viewModel

import android.util.Log
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.textview.MaterialTextView
import com.google.firebase.auth.FirebaseAuth
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.FragmentProductDetailsBinding
import com.gusoliveira.mystore.ui.productDetails.ProductDetailsFragmentArgs
import com.gusoliveira.mystore.ui.router.Router
import jp.wasabeef.glide.transformations.CropSquareTransformation

class ProductDetailsViewModelImpl(
    private val args: ProductDetailsFragmentArgs,
    private val router: Router
) : ProductDetailsViewModel() {

    //TODO: após configurar o firebase, esse armazenamento será no database real-time
    override var shoppingList: ArrayList<ProductEntity> = arrayListOf()

    override fun addProductToShoppingList() {
        shoppingList.add(args.product)
    }

    override fun setProduct(binding: FragmentProductDetailsBinding) {
        setImage(binding)
        setTitle(binding.idProductTitle)
        setDescription(binding.idDescriptionProduct)
    }

    override fun setImage(binding: FragmentProductDetailsBinding) {
        Glide
            .with(binding.root.context)
            .load(args.product.image)
            .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
            .into(binding.idImageProduct)
    }

    override fun setTitle(idProductTitle: MaterialTextView) {
        idProductTitle.text = args.product.title
    }


    override fun setDescription(idDescriptionProduct: MaterialTextView) {
        idDescriptionProduct.text = args.product.description
    }

    override fun buy() {
        //verifica se esta logado
        //sim -> tela de detalhes da compra
        //não -> faça login
        val user = FirebaseAuth.getInstance().currentUser
        Log.e("userAuth","${FirebaseAuth.getInstance().currentUser}")
        if (true) {
            //Ir para detalhes de compra/checkout
            //router.toCheckout(args.product)
        }
    }

}