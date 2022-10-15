package com.gusoliveira.mystore.ui.tabFragment.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import com.gusoliveira.mystore.R
import com.gusoliveira.mystore.databinding.FragmentTabOneBinding
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel

class TabOneFragment(private val viewModel: TabViewModel) : Fragment(R.layout.fragment_tab_one) {
    private lateinit var binding: FragmentTabOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTabOneBinding.bind(view)

        // Criar um observador que atualiza a UI
        val tabContentObserver = Observer<String>{ newContent ->
            binding.contentTitle.text = viewModel.getCurrent(newContent)
        }

        viewModel.getContentObserver().observe(viewLifecycleOwner, tabContentObserver)
        binding.btnTabOne.setOnClickListener {
            viewModel.getContentObserver().setValue("Tab one!")
        }
    }
}