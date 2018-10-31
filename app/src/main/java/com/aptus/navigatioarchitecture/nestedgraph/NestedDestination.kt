package com.aptus.navigatioarchitecture.nestedgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_nested_destination.*

class NestedDestination : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nested_destination, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        subGraphStep.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nestedDestination_to_subGraphStep1)
        )

        subGraph3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nestedDestination_to_subGraph3)
        )
    }

    companion object {
        @JvmStatic fun newInstance() = NestedDestination()
    }
}
