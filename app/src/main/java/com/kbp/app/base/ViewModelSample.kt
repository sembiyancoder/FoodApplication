package com.kbp.app.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelSample : ViewModel() {
    private val sampleListData: MutableLiveData<List<SampleModel>> = MutableLiveData()
    private var mRepo: SampleRepository? = null
    fun init() {
        mRepo = SampleRepository.getInstance()
    }

    fun getSampleList(): MutableLiveData<List<SampleModel>> {
        sampleListData.value = mRepo?.getSampleData()
        return sampleListData
    }
}