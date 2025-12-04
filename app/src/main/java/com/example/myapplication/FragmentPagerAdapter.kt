package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PageFragment.newInstance(
                "Trang 1",
                "Đây là Fragment đầu tiên trong ViewPager2",
                "#FF6B6B"
            )
            1 -> PageFragment.newInstance(
                "Trang 2",
                "Đây là Fragment thứ hai trong ViewPager2",
                "#4ECDC4"
            )
            2 -> PageFragment.newInstance(
                "Trang 3",
                "Đây là Fragment thứ ba trong ViewPager2",
                "#95E1D3"
            )
            3 -> PageFragment.newInstance(
                "Trang 4",
                "Đây là Fragment thứ tư trong ViewPager2",
                "#F38181"
            )
            else -> PageFragment.newInstance(
                "Trang ${position + 1}",
                "Fragment mặc định",
                "#CCCCCC"
            )
        }
    }
}

