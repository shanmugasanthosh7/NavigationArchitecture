package com.aptus.navigatioarchitecture.passdata

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_bundle.*

class BundleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bundle, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val bundle = Bundle()
        bundle.putString("name", "Santhosh")
        passBundle.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_bundleFragment_to_passBundleFragment, bundle))

        //Or

//        passBundle.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putString("name","Santhosh")
//            Navigation.findNavController(activity!!,R.id.my_nav_host_fragment).navigate(R.id.action_bundleFragment_to_passBundleFragment,bundle)
//        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = BundleFragment()
    }
}
