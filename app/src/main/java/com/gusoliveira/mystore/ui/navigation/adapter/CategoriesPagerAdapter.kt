package com.gusoliveira.mystore.ui.navigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gusoliveira.mystore.ui.tabFragment.category.CategoryFragment

class CategoriesPagerAdapter(
    private val categories: List<String>, fm: FragmentManager
) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount() = categories.size

    override fun getItem(position: Int): Fragment {
        val category = categories[position]
        return CategoryFragment.newInstance(category)
    }
}