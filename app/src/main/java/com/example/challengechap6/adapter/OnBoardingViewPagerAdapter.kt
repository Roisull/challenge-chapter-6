package com.example.challengechap6.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.challengechap6.R
import com.example.challengechap6.R.id.*
import com.example.challengechap6.model.DataOnBoarding

class OnBoardingViewPagerAdapter(
    private var context: Context,
    private var dataOnBoardingList: List<DataOnBoarding>
    ): PagerAdapter() {
    override fun getCount(): Int {
        return dataOnBoardingList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    @SuppressLint("MissingInflatedId")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_onboarding_screen, null)
        val imageView: ImageView
        val title: TextView
        val desc: TextView

        imageView = view.findViewById(ivImageOnBoarding)
        title = view.findViewById(tvTitleOnBoarding)
        desc = view.findViewById(tvDescOnBoarding)

        imageView.setImageResource(dataOnBoardingList[position].imageUrl)
        title.text = dataOnBoardingList[position].title
        desc.text = dataOnBoardingList[position].desc

        container.addView(view)

        return view
    }
}