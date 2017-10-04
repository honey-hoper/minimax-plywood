package com.webhopers.minimaxplywood.activities

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.webhopers.minimaxplywood.R
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        initUI()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    /**
     *
     * ui functions
     */
    private fun initUI() {
        window.decorView.setBackgroundResource(R.drawable.contact_background)
        setUpToolbar()
    }

    private fun setUpToolbar() {
        setSupportActionBar(ac_toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

}
