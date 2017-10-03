package com.webhopers.minimaxplywood.activities

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.webhopers.minimaxplywood.R
import kotlinx.android.synthetic.main.activity_about_us.*

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

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
        setUpToolbar()
        setTextContent()
    }

    private fun setUpToolbar() {
        setSupportActionBar(aau_toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun setTextContent() {
        val textP1 = "Founded in the year 2003, Minimax Metals and Plywood Pvt. Ltd. is an ISO 9000:2001 certified manufacturer, supplier and exporter of Plywood, Block Board, Moulded Designer Doors, Flush Doors, and many more. Our vast knowledge about wood products enable us to deliver products that hold nonpareil finishing and details. We enhance the utility and feasibility of our products by cautiously comparing the raw material mix with the application of products. Further, our Moulded Designer Doors are highly appreciated by the clients owing to their incredible style, better strength, no wrapping bending, smooth surface, etc. A very strict quality control program is followed by our firm in order to keep in level the quality of our wooden products."
        val textP2 = "We have a large and full facility infrastructure to support our manufacturing activities to run at a fast pace. Our production unit is fully installed with advanced technology machines, tools and equipment which are regularly serviced to enhance their productivity."

        val pre =   "<html>" +
                        "<body>" +
                            "<p align=\"justify\" style=\"padding:10px;\">"
        val post =          "</p>" +
                        "</body>" +
                    "</html>"

        val html = pre + textP1 + "</p><p align=\"justify\" style=\"padding:10px;\">" + textP2 + post

        aau_web_view.loadData(html, "text/html", "utf-8")
        aau_web_view.setBackgroundColor(Color.TRANSPARENT)
    }
}
