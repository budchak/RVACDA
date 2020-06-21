package com.yaroshevich.rvacda.rv.repository

import androidx.lifecycle.MutableLiveData
import com.yaroshevich.rvacda.rv.model.DataItem
import com.yaroshevich.rvacda.rv.model.DataPoluchatel

class DataItemRepository : Repository() {


    var list = MutableLiveData<List<DataItem>>()

    var dataPoluchatel = DataPoluchatel()

    init {
        update()
    }

    fun update() {

        list.value = dataPoluchatel.getItem()
    }
}
