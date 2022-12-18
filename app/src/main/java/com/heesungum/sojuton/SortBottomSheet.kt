package com.heesungum.sojuton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.heesungum.sojuton.databinding.SortBottomSheetBinding

class SortBottomSheet : BottomSheetDialogFragment() {
    private lateinit var binding: SortBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SortBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }
}