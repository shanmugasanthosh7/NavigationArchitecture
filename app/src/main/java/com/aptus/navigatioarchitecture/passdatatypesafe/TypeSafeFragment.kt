package com.aptus.navigatioarchitecture.passdatatypesafe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_type_safe.*

/**
 * A simple [Fragment] subclass.
 *
 */
class TypeSafeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_type_safe, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        passTypeSafe.setOnClickListener {
            val action = TypeSafeFragmentDirections.actionTypeSafeFragmentToPassTypeSafeFragment()
            action.setName("Santhosh")
            Navigation.findNavController(activity!!, R.id.my_nav_host_fragment).navigate(action)
        }
    }
}
