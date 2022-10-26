package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.R.layout
import com.gusoliveira.mystore.databinding.FragmentTabMeClothingBinding
import com.gusoliveira.mystore.databinding.FragmentTabWoClothingBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabMeClothingFragment(private val viewModel: TabViewModel) : Fragment(layout.fragment_tab_me_clothing) {
    private lateinit var binding: FragmentTabMeClothingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabMeClothingBinding.bind(view)

        viewModel.produtList.observe(viewLifecycleOwner, Observer { it ->
            Log.e("test","Men: $it")
        })
    }
}