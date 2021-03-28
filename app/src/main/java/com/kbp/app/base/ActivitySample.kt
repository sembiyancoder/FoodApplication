package com.kbp.app.base

import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kbp.app.R


class ActivitySample : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: SampleRecyclerViewAdapter? = null
    private val mProgressBar: ProgressBar? = null
    private var sampleViewModel: ViewModelSample? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        mRecyclerView = findViewById(R.id.sample_list)
        sampleViewModel = ViewModelProvider(this).get(ViewModelSample::class.java)
        sampleViewModel!!.init()

        sampleViewModel!!.getSampleList().observeForever {

            if (it !== null && it.isNotEmpty()) {
                mAdapter = SampleRecyclerViewAdapter(it)
                val linearLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
                mRecyclerView!!.layoutManager = linearLayoutManager
                mRecyclerView!!.adapter = mAdapter
            }
        }


    }
}