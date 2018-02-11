package com.example.andres.gallosapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser





class MainActivity : AppCompatActivity() {
    val manager = supportFragmentManager

    private var mTextMessage: TextView? = null
    private var mAuth: FirebaseAuth? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                Show_About_Fragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                Show_Info_Fragment()
                return@OnNavigationItemSelectedListener true
            }
//            R.id.navigation_notifications -> {
//                return@OnNavigationItemSelectedListener true
//            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
        setContentView(R.layout.activity_main)

        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        Show_About_Fragment()

    }

    fun Show_About_Fragment() {
        val transaction = manager.beginTransaction()
        val fragment = ListItemFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun Show_Info_Fragment() {
        val transaction = manager.beginTransaction()
        val fragment = InfoFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
