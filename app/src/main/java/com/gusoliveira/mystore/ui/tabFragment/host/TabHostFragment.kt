package com.gusoliveira.mystore.ui.tabFragment.host

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.google.android.material.tabs.TabLayoutMediator
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.FragmentTabHostBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel
import com.gusoliveira.mystore.ui.tabFragment.adapter.TabPagerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.Timer

class TabHostFragment : Fragment(R.layout.fragment_tab_host) {

    private lateinit var binding: FragmentTabHostBinding
    private val viewModel: TabViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabHostBinding.bind(view)


        observable()





    }

    private fun observable(){
        viewModel.categoryList.observe(viewLifecycleOwner, Observer (::setupPager))
    }

    private fun setupPager(categoryTitle:MutableList<Any>){
        val tabLayout = binding.tabLayoutTitle
        val pager = binding.pager

        pager.adapter = TabPagerAdapter(categoryTitle.size, this)

        TabLayoutMediator(tabLayout, pager){tab, position ->
            tab.text = categoryTitle[position].toString()
        }.attach()
    }

    fun getTabViewModel(): TabViewModel = viewModel


}