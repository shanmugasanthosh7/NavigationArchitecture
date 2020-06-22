package com.aptus.navigatioarchitecture

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aptus.navigatioarchitecture.drawerandoverfloemenu.NavigationDrawerActivity
import com.aptus.navigatioarchitecture.drawerandoverfloemenu.OverflowMenuActivity
import com.aptus.navigatioarchitecture.nestedgraph.NestedGraphActivity
import com.aptus.navigatioarchitecture.passdata.BundleActivity
import com.aptus.navigatioarchitecture.passdatatypesafe.TypeSafeDataActivity
import kotlinx.android.synthetic.main.fragment_navigation.*

class NavigationFragment : Fragment() {

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        navigateToSecondFragment.setOnClickListener {
            onButtonPressed()
        }
        navigateDrawerActivity.setOnClickListener {
            startActivity(Intent(requireContext(), NavigationDrawerActivity::class.java))
        }
        overFlowMenuActivity.setOnClickListener {
            startActivity(Intent(requireContext(), OverflowMenuActivity::class.java))
        }
        bundleActivity.setOnClickListener {
            startActivity(Intent(requireContext(), BundleActivity::class.java))
        }
        typeSafeActiviy.setOnClickListener {
            startActivity(Intent(requireContext(), TypeSafeDataActivity::class.java))
        }
        nestedGraphActiviy.setOnClickListener {
            startActivity(Intent(requireContext(), NestedGraphActivity::class.java))
        }
    }

    private fun onButtonPressed() {
        listener?.onFragmentInteraction()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(
                    context.toString() +
                            " must implement OnFragmentInteractionListener"
            )
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction()
    }

    companion object {
        @JvmStatic
        fun newInstance() = NavigationFragment()
    }
}
