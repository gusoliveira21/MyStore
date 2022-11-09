package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.FragmentTabEletronicsBinding
import com.gusoliveira.mystore.ui.tabFragment.adapterTabProduct.AdapterTab
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabEletronicFragment(private val viewModel: TabViewModel) : Fragment(R.layout.fragment_tab_eletronics) {
    private lateinit var binding: FragmentTabEletronicsBinding
    private var adapterTab = AdapterTab()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabEletronicsBinding.bind(view)
        observer()
    }

    private fun observer() {
        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            var product = it as MutableList<ProductEntity>
            viewModel.getProductByCategory(product, "electronics")
        })
        viewModel.electronicsList.observe(viewLifecycleOwner, Observer (::adapter))
    }

    private fun adapter(listObjectProdut: MutableList<ProductEntity>) {
        adapterTab.listObjectProdut = listObjectProdut
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        binding.recyclerView.adapter = adapterTab
    }
}
