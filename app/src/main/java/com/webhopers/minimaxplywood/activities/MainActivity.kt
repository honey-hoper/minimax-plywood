package com.webhopers.minimaxplywood.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.webhopers.minimaxplywood.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        am_about_btn.setOnClickListener { startAboutUsActivity() }
        am_contact_btn.setOnClickListener { startContactActivity() }
    }

    /**
     *
     * ui functions
     */
    fun startAboutUsActivity() {
        startActivity(Intent(this, AboutUsActivity::class.java))
    }

    fun startContactActivity() {
        startActivity(Intent(this, ContactActivity::class.java))
    }
}
