package com.gusoliveira.mystore.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.gusoliveira.mystore.databinding.FragmentHomeBinding
import com.gusoliveira.mystore.ui.home.adapter.PagerAdapter
import com.gusoliveira.mystore.ui.home.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var pagerAdapter: PagerAdapter
    private lateinit var pager: ViewPager2
    private lateinit var tab: TabLayout
    private val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observer()
    }

    private fun setup(categories: List<String>) {
        pager = binding.pager
        tab = binding.tabLayoutTitle
        pagerAdapter = PagerAdapter(this)

        pagerAdapter.categories = categories
        pager.adapter = pagerAdapter

        TabLayoutMediator(tab, pager) { tab, position ->
            tab.text = categories[position]
        }.attach()
    }

    private fun observer() {
        viewModel.categories.observe(viewLifecycleOwner, Observer(::setup))
    }
}