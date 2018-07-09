package com.aptus.navigatioarchitecture

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity(), NavigationFragment.OnFragmentInteractionListener, BlankFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction() {
        Navigation.findNavController(this, R.id.my_nav_host_fragment).navigate(R.id.action_navigationFragment_to_blankFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {// Up button will work on this method
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
