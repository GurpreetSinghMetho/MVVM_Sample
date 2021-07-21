package com.test.test.dataModel

import java.io.Serializable

data class DataListModel(var name: String, var latlng: List<Double>) : Serializable {
    fun latlngs(): String {
        var stringB: StringBuilder = StringBuilder()
        for (i in latlng.indices) {
            stringB.append(latlng[i].toString())
            if (i < latlng.size-1) {
                stringB.append(",")
            }
        }
        return stringB.toString()
    }
}
