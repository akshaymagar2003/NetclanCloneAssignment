package com.example.netclanclone.ui.explore

import MyPagerAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.netclanclone.R
import com.google.android.material.tabs.TabLayout

class ExploreFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)


        tabLayout = view.findViewById(R.id.tabLayout)
        viewPager = view.findViewById(R.id.viewPager)



        val adapter = MyPagerAdapter(childFragmentManager)
        viewPager.adapter = adapter


        tabLayout.setupWithViewPager(viewPager)
        for (i in 0 until tabLayout.tabCount) {
            val tab: TabLayout.Tab? = tabLayout.getTabAt(i)
            when (i) {
                0 -> tab?.setIcon(R.drawable.people)
                1 -> tab?.setIcon(R.drawable.briefcase)
                2 -> tab?.setIcon(R.drawable.window)
                else -> {
                    // Do nothing
                }
            }
        }








        return view
    }
}
