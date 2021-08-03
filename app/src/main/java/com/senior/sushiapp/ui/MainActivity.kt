package com.senior.sushiapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.senior.sushiapp.R
import com.senior.sushiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host_main_navigation)
        //        binding.navView.setItemIconTintList(null);
//        binding.navView.bringToFront();
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,binding.drawerLayout,binding.topAppBar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
//        binding.drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//        //binding.navView.setNavigationItemSelectedListener(this);
//        NavigationUI.setupWithNavController(binding.navView,navController);
    }
}