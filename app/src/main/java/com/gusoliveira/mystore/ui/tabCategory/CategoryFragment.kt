package com.gusoliveira.mystore.ui.tabCategory

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class CategoryFragment : Fragment() {


    companion object {
        private const val CATEGORY_NAME_BUNDLE = "category_name_bundle"
        fun newInstance(categoryName: String) = CategoryFragment().apply {
            arguments = bundleOf(
                CATEGORY_NAME_BUNDLE to categoryName,
            )
        }
    }
}