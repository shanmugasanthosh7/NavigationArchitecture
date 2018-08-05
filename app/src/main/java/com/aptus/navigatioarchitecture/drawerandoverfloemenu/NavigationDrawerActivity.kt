package com.aptus.navigatioarchitecture.drawerandoverfloemenu

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawerActivity : AppCompatActivity(), HomeFragment.OnFragmentInteractionListener,
        NavFirstFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        setSupportActionBar(toolBar)
        title = "Navigation Drawer Activity"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        setUpDrawerToggle()
        NavigationUI.setupWithNavController(navView,
                Navigation.findNavController(this, R.id.navDrawerActivity))
    }

    private fun setUpDrawerToggle() {
        val mDrawerToggle = object : ActionBarDrawerToggle(this, navDrawer, toolBar,
                R.string.open, R.string.close) {}
        navDrawer.addDrawerListener(mDrawerToggle)
        mDrawerToggle.syncState()
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}