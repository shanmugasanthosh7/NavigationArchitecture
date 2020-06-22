package com.aptus.navigatioarchitecture.nestedgraph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.aptus.navigatioarchitecture.R

class NestedGraphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested_graph)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        // Up button will work on this method
        return Navigation.findNavController(this, R.id.nested_graph_host_fragment).navigateUp()
    }
}