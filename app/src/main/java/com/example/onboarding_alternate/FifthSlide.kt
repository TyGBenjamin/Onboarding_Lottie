package com.example.onboarding_alternate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onboarding_alternate.R
import com.example.onboarding_alternate.databinding.FragmentFifthSlideBinding
import com.example.onboarding_alternate.databinding.FragmentFirstSlideBinding
import com.example.onboarding_alternate.databinding.FragmentThirdSlideBinding

class FifthSlide: Fragment() {
    private var _binding: FragmentFifthSlideBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFifthSlideBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.prevButton.setOnClickListener{
            findNavController().navigate(R.id.fourthSlide)
        }

        binding.nextButton.setOnClickListener{
            findNavController().navigateUp()
        }
    }
}
