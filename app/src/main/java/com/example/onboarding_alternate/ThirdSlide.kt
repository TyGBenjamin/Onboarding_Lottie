package com.example.onboarding_alternate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.onboarding_alternate.R
import com.example.onboarding_alternate.databinding.FragmentFirstSlideBinding
import com.example.onboarding_alternate.databinding.FragmentThirdSlideBinding

class ThirdSlide: Fragment() {
    private var _binding: FragmentThirdSlideBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdSlideBinding.inflate(inflater, container, false)
        return binding.root

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third_slide, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.prevButton.setOnClickListener{
            findNavController().navigateUp()
        }

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.fourthSlide)
        }
    }

}
