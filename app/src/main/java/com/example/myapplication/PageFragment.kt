package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PageFragment : Fragment() {
    private var title: String? = null
    private var description: String? = null
    private var backgroundColor: String? = null

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_DESCRIPTION = "description"
        private const val ARG_BACKGROUND_COLOR = "backgroundColor"

        fun newInstance(title: String, description: String, backgroundColor: String): PageFragment {
            val fragment = PageFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_DESCRIPTION, description)
            args.putString(ARG_BACKGROUND_COLOR, backgroundColor)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_TITLE)
            description = it.getString(ARG_DESCRIPTION)
            backgroundColor = it.getString(ARG_BACKGROUND_COLOR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Thiết lập background color
        backgroundColor?.let {
            view.setBackgroundColor(Color.parseColor(it))
        }

        // Thiết lập title
        view.findViewById<android.widget.TextView>(R.id.titleText).text = title

        // Thiết lập description
        view.findViewById<android.widget.TextView>(R.id.descriptionText).text = description

        // Ẩn ImageView vì chúng ta không sử dụng trong demo này
        view.findViewById<android.widget.ImageView>(R.id.iconImage).visibility = View.GONE
    }
}

