package com.example.mycalendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import com.example.mycalendar.Fragment.HomeFragment
import com.example.mycalendar.Fragment.ProfileFragment
import com.example.mycalendar.Fragment.myCalendarFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val MycalendarFragment = myCalendarFragment()
        val profileFragment = ProfileFragment()
        val navbar = findViewById<BottomNavigationView>(R.id.Navbar)
        makecurrentfragment(homeFragment)

        navbar.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.home ->makecurrentfragment(homeFragment)
                R.id.myCalendar ->makecurrentfragment(MycalendarFragment)
                R.id.profile ->makecurrentfragment(profileFragment)
            }
            true
        }

    }

    private fun makecurrentfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framenavbar, fragment)
            commit()
        }
    }
}