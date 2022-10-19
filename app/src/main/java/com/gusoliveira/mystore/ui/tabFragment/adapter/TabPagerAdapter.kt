package com.gusoliveira.mystore.ui.tabFragment.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gusoliveira.mystore.ui.tabFragment.host.TabHostFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabOneFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabTwoFragment

class TabPagerAdapter(private val numOfTabs:Int, val host: TabHostFragment) : FragmentStateAdapter(host) {
    override fun getItemCount(): Int = numOfTabs
    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> TabOneFragment(host.getTabViewModel())
            1 -> TabTwoFragment(host.getTabViewModel())
            else -> TabTwoFragment(host.getTabViewModel())
        }
    }
}