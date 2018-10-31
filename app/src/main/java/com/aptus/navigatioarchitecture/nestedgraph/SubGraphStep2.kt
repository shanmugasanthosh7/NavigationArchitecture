package com.aptus.navigatioarchitecture.nestedgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aptus.navigatioarchitecture.R

class SubGraphStep2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub_graph_step2, container, false)
    }

    companion object {
        @JvmStatic fun newInstance() = SubGraphStep2()
    }
}
