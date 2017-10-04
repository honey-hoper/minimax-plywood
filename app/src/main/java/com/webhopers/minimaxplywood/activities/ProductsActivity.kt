package com.webhopers.minimaxplywood.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager

import com.webhopers.minimaxplywood.R
import com.webhopers.minimaxplywood.adapters.GridAdapter
import com.webhopers.minimaxplywood.utils.RecyclerViewDecorator
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

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
        setUpRecyclerView()
    }

    private fun setUpToolbar() {
        setSupportActionBar(ap_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun setUpRecyclerView() {
        ap_recycler_view.adapter = GridAdapter()
        ap_recycler_view.layoutManager = GridLayoutManager(this, 2)
        ap_recycler_view.addItemDecoration(RecyclerViewDecorator(2, 5, true))
    }
}
