package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.R.layout
import com.gusoliveira.mystore.databinding.FragmentTabWoClothingBinding
import com.gusoliveira.mystore.ui.tabFragment.adapterTab.AdapterTab
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabWoClothingFragment(private val viewModel: TabViewModel) : Fragment(layout.fragment_tab_wo_clothing) {
    private lateinit var binding: FragmentTabWoClothingBinding
    private var adapterTab = AdapterTab()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabWoClothingBinding.bind(view)
        observer()
    }

    private fun observer() {
        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            var product = it as MutableList<ProductEntity>
            viewModel.getProductByCategory(product, "women's clothing")
        })
        viewModel.wClothingList.observe(viewLifecycleOwner, Observer (::adapter))
    }

    private fun adapter(listObjectProdut: MutableList<ProductEntity>) {
        adapterTab.listObjectProdut = listObjectProdut
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 1)
        binding.recyclerView.adapter = adapterTab
    }
}



