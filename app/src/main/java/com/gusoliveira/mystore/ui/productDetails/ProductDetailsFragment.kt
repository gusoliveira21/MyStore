package com.gusoliveira.mystore.ui.productDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gusoliveira.mystore.databinding.FragmentProductDetailsBinding
import com.gusoliveira.mystore.ui.productDetails.viewModel.ProductDetailsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ProductDetailsFragment : Fragment() {
    private val args: ProductDetailsFragmentArgs by navArgs()
    private val navController by lazy { findNavController() }
    private val viewModel: ProductDetailsViewModel by viewModel {
        parametersOf(
            args,
            navController
        )
    }
    private var _binding: FragmentProductDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.setProduct(binding)
        checkoutProduct()
        listeners()
    }

    private fun listeners(){
        //TODO: Ao clicar no botao, realiza a ação
        binding.idBtAddToShoppingList.setOnClickListener {
            viewModel.addProductToShoppingList()
        }
    }

    private fun checkoutProduct() {
        binding.idBtBuy.setOnClickListener {
            viewModel.buy()
        }
    }
}