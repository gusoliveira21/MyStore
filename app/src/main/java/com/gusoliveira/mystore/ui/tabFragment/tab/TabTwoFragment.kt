package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import com.gusoliveira.mystore.R.layout
import com.gusoliveira.mystore.databinding.FragmentTabTwoBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabTwoFragment(private val viewModel: TabViewModel) : Fragment(layout.fragment_tab_two) {
    private lateinit var binding: FragmentTabTwoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabTwoBinding.bind(view)

        val tabContentObserver = Observer<String> { newContent ->
            binding.content.text = viewModel.getCurrent(newContent) /**Conteudo da tela*/
        }
        viewModel.getContentObserver().observe(viewLifecycleOwner, tabContentObserver)
        binding.btnTabTwo.setOnClickListener {
            viewModel.getContentObserver().setValue("tab two")
        }
    }
}



