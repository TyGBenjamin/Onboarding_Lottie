package com.example.onboarding_alternate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onboarding_alternate.R
import com.example.onboarding_alternate.databinding.FragmentFirstBinding
import com.example.onboarding_alternate.databinding.FragmentFirstSlideBinding

class FirstSlide: Fragment() {
    private var _binding: FragmentFirstSlideBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstSlideBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.secondSlide)
        }

    }

}
