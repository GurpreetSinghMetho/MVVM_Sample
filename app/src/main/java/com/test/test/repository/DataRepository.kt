package com.test.test.repository

import com.test.test.dataModel.DataListModel
import com.test.test.utility.Util
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataRepository() {
    private val webService = Util().createWebService()

    fun getDataList(onData: OnData) {
        webService.getList().enqueue(object : Callback<List<DataListModel>> {
            override fun onResponse(
                call: Call<List<DataListModel>>,
                response: Response<List<DataListModel>>
            ) {

                onData.onSuccess(response.body() as List<DataListModel>)
            }

            override fun onFailure(call: Call<List<DataListModel>>, t: Throwable) {
                onData.onFailure()
            }

        })

    }

    interface OnData {
        fun onSuccess(data: List<DataListModel>)
        fun onFailure()
    }
}