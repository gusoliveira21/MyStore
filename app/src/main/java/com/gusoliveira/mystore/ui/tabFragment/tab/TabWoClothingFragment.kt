package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.gusoliveira.mystore.R.layout
import com.gusoliveira.mystore.databinding.FragmentTabWoClothingBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabWoClothingFragment(private val viewModel: TabViewModel) : Fragment(layout.fragment_tab_wo_clothing) {
    private lateinit var binding: FragmentTabWoClothingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabWoClothingBinding.bind(view)

        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            Log.e("test","Woman: $it")
        })
    }
}



