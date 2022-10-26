package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.FragmentTabEletronicsBinding
import com.gusoliveira.mystore.databinding.FragmentTabJeweleryBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabJeweleryFragment(private val viewModel: TabViewModel) : Fragment(R.layout.fragment_tab_eletronics) {
    private lateinit var binding: FragmentTabJeweleryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabJeweleryBinding.bind(view)
        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            Log.e("test","Jewelery: $it")
        })

    }
}