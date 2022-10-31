package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.FragmentTabJeweleryBinding
import com.gusoliveira.mystore.ui.tabFragment.adapterTab.AdapterTab
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabJeweleryFragment(private val viewModel: TabViewModel) : Fragment(R.layout.fragment_tab_eletronics) {
    private lateinit var binding: FragmentTabJeweleryBinding
    private var adapterTab = AdapterTab()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabJeweleryBinding.bind(view)
        observer()
    }

    private fun observer() {
        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            var product = it as MutableList<ProductEntity>
            viewModel.getProductByCategory(product, "jewelery")
        })
        viewModel.jeweleryList.observe(viewLifecycleOwner, Observer (::adapter))
    }

    private fun adapter(listObjectProdut: MutableList<ProductEntity>) {
        adapterTab.listObjectProdut = listObjectProdut
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        binding.recyclerView.adapter = adapterTab
    }
}