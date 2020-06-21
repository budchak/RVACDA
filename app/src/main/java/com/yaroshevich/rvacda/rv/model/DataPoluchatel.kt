package com.yaroshevich.rvacda.rv.model

class DataPoluchatel {

    val list = mutableListOf<DataItem>()
    var position = 0

    init {
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
        list.add(DataItem("name"))
    }

    fun getItem(): List<DataItem>{
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        list.add(DataItem("Add $position"))
        position++
        return list
    }
}