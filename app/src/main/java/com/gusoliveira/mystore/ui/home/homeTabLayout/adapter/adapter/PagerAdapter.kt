package com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gusoliveira.mystore.ui.home.productViewPager.ProductsFragment

class PagerAdapter(fm: Fragment) : FragmentStateAdapter(fm) {
    var categories: List<String> = mutableListOf()
    override fun getItemCount() = categories.size
    override fun createFragment(position: Int): Fragment {
        val category = categories[position]
        return ProductsFragment.newInstance(category)
    }
}