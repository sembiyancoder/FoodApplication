package com.kbp.app.base

import androidx.lifecycle.MutableLiveData

class SampleRepository {
    var tempList: ArrayList<SampleModel> = ArrayList()
    companion object {
        private var instance: SampleRepository? = null
        fun getInstance(): SampleRepository? {
            if (instance == null) {
                instance = SampleRepository()
            }
            return instance
        }
    }

    fun getSampleData(): List<SampleModel> {
        tempList.add(
            SampleModel(
                "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                "Havasu Falls"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/tpsnoz5bzo501.jpg",
                "Trondheim"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/qn7f9oqu7o501.jpg",
                "Portugal"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/j6myfqglup501.jpg",
                "Rocky Mountain National Park"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/0h2gm1ix6p501.jpg",
                "Havasu Falls"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/k98uzl68eh501.jpg",
                "Mahahual"
            )
        )
        tempList.add(
            SampleModel(
                "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                "Frozen Lake"
            )
        )
        tempList.add(
            SampleModel(
                "https://i.redd.it/obx4zydshg601.jpg",
                "Austrailia"
            )
        )
        return tempList
    }

}