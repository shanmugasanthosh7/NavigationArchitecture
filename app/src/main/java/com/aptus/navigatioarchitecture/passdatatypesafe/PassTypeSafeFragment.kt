package com.aptus.navigatioarchitecture.passdatatypesafe


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_pass_type_safe.*

/**
 * A simple [Fragment] subclass.
 *
 */
class PassTypeSafeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pass_type_safe, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val name = PassTypeSafeFragmentArgs.fromBundle(arguments).name
        passTypeValue.text = name
    }
}
