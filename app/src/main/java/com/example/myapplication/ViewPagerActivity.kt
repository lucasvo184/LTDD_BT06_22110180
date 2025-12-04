package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.button.MaterialButton

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var viewPager: androidx.viewpager2.widget.ViewPager2
    private lateinit var tabLayout: com.google.android.material.tabs.TabLayout
    private lateinit var btnBack: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        btnBack = findViewById(R.id.btnBack)

        // Tạo adapter cho ViewPager2
        val adapter = FragmentPagerAdapter(this)
        viewPager.adapter = adapter

        // Kết nối TabLayout với ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Trang 1"
                1 -> "Trang 2"
                2 -> "Trang 3"
                3 -> "Trang 4"
                else -> "Trang ${position + 1}"
            }
        }.attach()

        // Nút Back
        btnBack.setOnClickListener {
            finish()
        }
    }
}

