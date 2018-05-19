package com.aptus.navigatioarchitecture.drawerandoverfloemenu

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.aptus.navigatioarchitecture.R
import kotlinx.android.synthetic.main.activity_over_flow_menu.*

class OverflowMenuActivity : AppCompatActivity(), HomeMenuFragment.OnFragmentInteractionListener, MenuItemOne.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_flow_menu)
        setSupportActionBar(toolBar)
        title = "Overflow Menu Activity"
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.menu_overflow, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        NavigationUI.onNavDestinationSelected(item!!, Navigation.findNavController(this, R.id.navOverFlowMenuActivity))
        return super.onOptionsItemSelected(item)
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}