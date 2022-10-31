package com.gusoliveira.mystore.ui.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.gusoliveira.mystore.databinding.ActivityMainBinding
import com.gusoliveira.mystore.ui.navigation.adapter.CategoriesPagerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    private lateinit var binding : ActivityMainBinding

    private lateinit var categoriesPagerAdapter: CategoriesPagerAdapter
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupObservers()

        viewModel.getCategories()
    }

    private fun setupObservers() {
       viewModel.categories.observe(this, ::setupTabs)
    }

    private fun setupTabs(categories: List<String>) {
        categoriesPagerAdapter = CategoriesPagerAdapter(categories, supportFragmentManager)
        viewPager.adapter = categoriesPagerAdapter
    }
}