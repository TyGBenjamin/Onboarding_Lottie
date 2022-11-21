package com.example.onboarding_alternate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onboarding_alternate.databinding.FragmentViewpagerBinding

class ViewPager : Fragment() {
    private var _binding: FragmentViewpagerBinding? = null
    private val binding: FragmentViewpagerBinding  get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentViewpagerBinding.inflate(inflater, container, false).also {
        _binding = it
    }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    private fun initViews() = with(binding) {
        val fragmentList = arrayListOf<Fragment>(
            FirstSlide(),
            SecondSlide(),
            ThirdSlide(),
            FourthSlide(),
            FifthSlide()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        viewPager.adapter = adapter

    }


}
