package com.gusoliveira.mystore.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.gusoliveira.mystore.databinding.ViewpagerBinding

class ProductsFragment : Fragment() {
    private lateinit var binding: ViewpagerBinding
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
        fun newInstance(categoryName: String) = ProductsFragment().apply {
            arguments = bundleOf(
                CATEGORY_NAME_BUNDLE to categoryName,
            )
        }
    }
}