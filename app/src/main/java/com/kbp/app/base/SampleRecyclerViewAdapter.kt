package com.kbp.app.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.kbp.app.R
import de.hdodenhof.circleimageview.CircleImageView

class SampleRecyclerViewAdapter(private var sampleList: List<SampleModel>) :
    RecyclerView.Adapter<SampleRecyclerViewAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.imageTitle)
        var imageView: CircleImageView = view.findViewById(R.id.sampleImage)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sample_list_row_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = sampleList[position]
        holder.title.text = movie.title
        Glide.with(holder.itemView.context).load(movie.imageUrl)
            .thumbnail(0.5f)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imageView);
    }

    override fun getItemCount(): Int {
        return sampleList.size
    }
}