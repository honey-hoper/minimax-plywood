package com.webhopers.minimaxplywood.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.webhopers.minimaxplywood.R
import kotlinx.android.synthetic.main.grid_item.view.*

class GridAdapter : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    val dataset = listOf(
            R.drawable.test1,
            R.drawable.test2,
            R.drawable.test3,
            R.drawable.test4,
            R.drawable.test5,
            R.drawable.test6,
            R.drawable.test7,
            R.drawable.test8,
            R.drawable.test9,
            R.drawable.test10,
            R.drawable.test11,
            R.drawable.test12,
            R.drawable.test13,
            R.drawable.test14,
            R.drawable.test15,
            R.drawable.test16
            )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.with(holder.itemView.context)
                .load(dataset[position])
                .resize(500, 500)
                .centerCrop()
                .into(holder.itemView.gi_image_view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}