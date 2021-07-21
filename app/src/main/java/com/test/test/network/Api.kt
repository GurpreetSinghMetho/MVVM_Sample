package com.test.test.network

import com.test.test.dataModel.DataListModel
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("all/")
    fun getList(): Call<List<DataListModel>>
}