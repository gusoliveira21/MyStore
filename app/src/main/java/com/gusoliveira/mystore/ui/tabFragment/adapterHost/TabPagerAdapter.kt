package com.gusoliveira.mystore.ui.tabFragment.adapterHost

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.gusoliveira.mystore.ui.tabFragment.host.TabHostFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabEletronicFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabJeweleryFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabMeClothingFragment
import com.gusoliveira.mystore.ui.tabFragment.tab.TabWoClothingFragment

class TabPagerAdapter(private val numOfTabs:Int, private val host: TabHostFragment) : FragmentStateAdapter(host) {
    override fun getItemCount(): Int = numOfTabs
    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> TabEletronicFragment(host.getTabViewModel())
            1 -> TabWoClothingFragment(host.getTabViewModel())
            2 -> TabMeClothingFragment(host.getTabViewModel())
            else -> TabJeweleryFragment(host.getTabViewModel())
        }
    }
}