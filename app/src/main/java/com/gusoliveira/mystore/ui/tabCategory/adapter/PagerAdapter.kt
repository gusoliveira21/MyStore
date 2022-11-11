package com.gusoliveira.mystore.ui.tabCategory.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gusoliveira.mystore.ui.HomeFragment
import com.gusoliveira.mystore.ui.tabCategory.CategoryFragment

class PagerAdapter(fm: Fragment) : FragmentStateAdapter(fm) {

    var categories: List<String> = mutableListOf()

    override fun getItemCount() = categories.size

    override fun createFragment(position: Int): Fragment {
        val category = categories[position]
        return CategoryFragment.newInstance(category)
    }
}