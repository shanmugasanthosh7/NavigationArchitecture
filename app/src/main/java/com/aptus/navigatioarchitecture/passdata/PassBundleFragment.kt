package com.aptus.navigatioarchitecture.passdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_pass_bundle.*


class PassBundleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pass_bundle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val name = arguments?.getString("name")
        bundleValue.text = name
    }

    companion object {
        @JvmStatic
        fun newInstance() = PassBundleFragment()
    }
}
