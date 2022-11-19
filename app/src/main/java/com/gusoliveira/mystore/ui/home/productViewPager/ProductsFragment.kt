package com.gusoliveira.mystore.ui.home.productViewPager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.FragmentProductsBinding
import com.gusoliveira.mystore.ui.home.productViewPager.adapter.ItemAdapter
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ProductsFragment : Fragment() {

    private val navController by lazy { findNavController() }
    private lateinit var binding: FragmentProductsBinding
    private lateinit var recyclerView: RecyclerView
    private var position: String? = null
    private val viewModel: ProductViewModel by viewModel { parametersOf(navController) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        callGetProducts()
        observer()
    }

    private fun observer() {
        viewModel.product.observe(viewLifecycleOwner, Observer(::setupRecyclerView))
    }

    private fun setupRecyclerView(list: List<ProductEntity>) {
        recyclerView = binding.recyclerview
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        recyclerView.adapter = adapterReturn(list)
    }

    private fun adapterReturn(list: List<ProductEntity>): ItemAdapter {
        return ItemAdapter(list) { viewModel.onProductClicked(it) }
    }

    private fun callGetProducts() {
        position = arguments?.getString(CATEGORY_NAME_BUNDLE)
        viewModel.getProducts(position.toString())
    }

    companion object {
        private const val CATEGORY_NAME_BUNDLE = "category_name_bundle"
        fun newInstance(categoryName: String) = ProductsFragment().apply {
            arguments = bundleOf(
                CATEGORY_NAME_BUNDLE to categoryName,
            )
        }
    }
}


