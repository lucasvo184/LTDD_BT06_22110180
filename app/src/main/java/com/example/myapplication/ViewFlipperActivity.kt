package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ViewFlipper
import com.google.android.material.button.MaterialButton

class ViewFlipperActivity : AppCompatActivity() {
    private lateinit var viewFlipper: ViewFlipper
    private lateinit var btnPrevious: MaterialButton
    private lateinit var btnNext: MaterialButton
    private lateinit var btnBack: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_flipper)

        viewFlipper = findViewById(R.id.viewFlipper)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext = findViewById(R.id.btnNext)
        btnBack = findViewById(R.id.btnBack)

        // Nút Previous - chuyển về trang trước
        btnPrevious.setOnClickListener {
            viewFlipper.showPrevious()
            // Tắt auto-start khi người dùng điều khiển thủ công
            viewFlipper.stopFlipping()
        }

        // Nút Next - chuyển sang trang tiếp theo
        btnNext.setOnClickListener {
            viewFlipper.showNext()
            // Tắt auto-start khi người dùng điều khiển thủ công
            viewFlipper.stopFlipping()
        }

        // Nút Back - quay lại MainActivity
        btnBack.setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        // Dừng auto-flip khi activity bị pause
        viewFlipper.stopFlipping()
    }

    override fun onResume() {
        super.onResume()
        // Tiếp tục auto-flip khi activity resume
        viewFlipper.startFlipping()
    }
}

