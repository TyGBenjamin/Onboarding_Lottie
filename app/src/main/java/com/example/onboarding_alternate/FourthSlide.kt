package com.example.onboarding_alternate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onboarding_alternate.databinding.FragmentFirstSlideBinding
import com.example.onboarding_alternate.databinding.FragmentFourthSlideBinding

class FourthSlide: Fragment() {
    private var _binding: FragmentFourthSlideBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourthSlideBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.prevButton.setOnClickListener{
            findNavController().navigateUp()
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.fifthSlide)
        }

    }
}
