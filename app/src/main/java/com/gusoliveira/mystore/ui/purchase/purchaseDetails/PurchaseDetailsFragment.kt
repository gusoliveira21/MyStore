package com.gusoliveira.mystore.ui.purchase.purchaseDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gusoliveira.mystore.databinding.FragmentPurchaseDetailsBinding
import com.gusoliveira.mystore.ui.purchase.purchaseDetails.viewModel.PurchaseDetailsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf


class PurchaseDetailsFragment : Fragment() {
    private val args: PurchaseDetailsFragmentArgs by navArgs()
    private val navController by lazy { findNavController() }
    private val viewModel: PurchaseDetailsViewModel by viewModel {
        parametersOf(
            args,
            navController
        )
    }

    private var _binding: FragmentPurchaseDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPurchaseDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}