package com.gusoliveira.mystore.ui.tabCategory

import android.os.Bundle
import android.system.Os
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.ItemProdutBinding
import com.gusoliveira.mystore.databinding.ViewpagerBinding
import com.gusoliveira.mystore.ui.tabCategory.adapter.ItemAdapter
import com.gusoliveira.mystore.ui.tabCategory.adapter.PagerAdapter

private lateinit var binding: ViewpagerBinding
private const val ARG_OBJECT = "object"

class CategoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ViewpagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val textview : TextView = view.findViewById(android.R.id.text1)
            textview.text = getInt(ARG_OBJECT).toString()
        }*/
        /*val position = arguments?.getInt(ARG_OBJECT)
        val viewPager = binding.pagerViewP
        position.let {
            when(position){
                0 -> viewPager?.adapter = ItemAdapter(mutableListOf("", "", "", ""))
                1 -> viewPager?.adapter = ItemAdapter(mutableListOf("", "", "", ""))
                2 -> viewPager?.adapter = ItemAdapter(mutableListOf("", "", "", ""))
                3 -> viewPager?.adapter = ItemAdapter(mutableListOf("", "", "", ""))
                else -> viewPager?.adapter = ItemAdapter(mutableListOf("", "", "", ""))
            }
        }*/
    }

    companion object {
        private const val CATEGORY_NAME_BUNDLE = "category_name_bundle"
        fun newInstance(categoryName: String) = CategoryFragment().apply {
            arguments = bundleOf(
                CATEGORY_NAME_BUNDLE to categoryName,
            )
        }
    }
}