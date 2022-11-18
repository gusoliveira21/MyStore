package com.gusoliveira.mystore.ui.home.productViewPager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ViewpagerBinding
import com.gusoliveira.mystore.ui.home.productViewPager.adapter.ItemAdapter
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProductsFragment : Fragment() {
    private lateinit var binding: ViewpagerBinding
    private lateinit var viewPager: ViewPager2
    private var position: String? = null
    private val viewModel: ProductViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = ViewpagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        callGetProducts()
        observer()
    }

    private fun observer() {
        viewModel.product.observe(viewLifecycleOwner, Observer(::setupViewPager))
    }

    private fun setupViewPager(list:List<ProductEntity>){
        viewPager = binding.pagerViewP
        viewPager.adapter = ItemAdapter(list)
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