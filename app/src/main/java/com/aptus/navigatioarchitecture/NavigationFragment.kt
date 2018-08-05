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
import com.aptus.navigatioarchitecture.passdata.BundleActivity
import com.aptus.navigatioarchitecture.passdatatypesafe.TypeSafeDataActivity
import kotlinx.android.synthetic.main.fragment_navigation.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [NavigationFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [NavigationFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class NavigationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        navigateToSecondFragment.setOnClickListener{
            onButtonPressed()
        }
        navigateDrawerActivity.setOnClickListener {
            startActivity(Intent(context!!, NavigationDrawerActivity::class.java))
        }
        overFlowMenuActivity.setOnClickListener {
            startActivity(Intent(context!!,OverflowMenuActivity::class.java))
        }
        bundleActivity.setOnClickListener {
            startActivity(Intent(context!!,BundleActivity::class.java))
        }
        typeSafeActiviy.setOnClickListener {
            startActivity(Intent(context!!,TypeSafeDataActivity::class.java))
        }
    }

    fun onButtonPressed() {
        listener?.onFragmentInteraction()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NavigationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                NavigationFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
