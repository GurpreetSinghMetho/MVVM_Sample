package com.test.test.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.test.dataModel.DataListModel
import com.test.test.repository.DataRepository

class DataViewModel: ViewModel() {
    var listOfData = MutableLiveData<List<DataListModel>>()

    init {
        listOfData.value = listOf()
    }
    fun getDataList() {
        DataRepository().getDataList(object : DataRepository.OnData {
            override fun onSuccess(data: List<DataListModel>) {
                listOfData.value = data
            }

            override fun onFailure() {
            }

        })
    }
}