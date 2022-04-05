package com.example.myapplication4

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplication4.databinding.ActivityMainBinding
import android.media.MediaPlayer
import android.view.View


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        //binding.fab.setOnClickListener { view ->
           // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
             //   .setAction("Action", null).show()
       // }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    private fun onHome() {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.to_Home)
    }
    private fun onAra() {
        //val navController = findNavController(R.id.nav_host_fragment_content_main)
       // navController.navigate(R.id.action_FirstFragment_to_ThirdFragment)
        //val navController = navController.currentDestination?.getId()
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.to_Ara)



    }
    private fun onFalco() {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.to_Falco)
    }
    private fun onPelecanus() {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.to_Pele)
    }
    private fun onNoctua() {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        navController.navigate(R.id.to_Athene)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val CurrentFragment = supportFragmentManager.fragments.last().apply {
            println(this)
        }
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings1  -> {
                onHome()
                true
            }
            R.id.action_settings2  -> {
                onAra()
                true
            }
            R.id.action_settings3 -> {
                onFalco()
                true
            }
            R.id.action_settings4 -> {
                onPelecanus()
                true
            }
            R.id.action_settings5 -> {
                onNoctua()
                true
            }


            //  R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}