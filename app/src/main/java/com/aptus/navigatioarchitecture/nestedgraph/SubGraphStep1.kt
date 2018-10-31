package com.aptus.navigatioarchitecture.nestedgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.fragment_sub_graph_step1.*

class SubGraphStep1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sub_graph_step1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        step2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_subGraphStep1_to_subGraphStep2)
        )
    }

    companion object {
        @JvmStatic fun newInstance() = SubGraphStep1()
    }
}
