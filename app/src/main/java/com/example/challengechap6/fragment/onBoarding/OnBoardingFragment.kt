package com.example.challengechap6.fragment.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.challengechap6.R
import com.example.challengechap6.adapter.OnBoardingViewPagerAdapter

class OnBoardingFragment : Fragment() {

    var onBoardingViewPagerAdapter: OnBoardingViewPagerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding, container, false)
    }
}