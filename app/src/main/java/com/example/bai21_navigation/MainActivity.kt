package com.example.bai21_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // sử dụng màu cho icon menu
        val nav_leftmenu = findViewById<NavigationView>(R.id.nav_leftmenu)
        nav_leftmenu.itemIconTintList = null

        //lắng nghe sự kiện click lên item menu
        nav_leftmenu.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_home->Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                R.id.nav_message->Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show()
                R.id.nav_exit->finish()
            }
            true
        }
    }
}