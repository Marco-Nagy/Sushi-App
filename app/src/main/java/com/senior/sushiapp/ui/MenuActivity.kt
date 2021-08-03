package com.senior.sushiapp.ui

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.senior.sushiapp.R
import com.senior.sushiapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit  var binding: ActivityMenuBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu)
        navController = Navigation.findNavController(this, R.id.nav_host_menu_navigation)
        binding.navView.itemIconTintList = null
        binding.navView.bringToFront()
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.topAppBar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        //binding.navView.setNavigationItemSelectedListener(this);
        NavigationUI.setupWithNavController(binding.navView, navController)
    }
}