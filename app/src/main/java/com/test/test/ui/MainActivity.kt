package com.test.test.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.test.test.R
import com.test.test.adapter.DataListAdapter
import com.test.test.dataModel.DataListModel
import com.test.test.viewModel.DataViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var dataViewModels: DataViewModel = DataViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inits()
    }

    fun inits() {
        dataViewModels.getDataList()
        dataViewModels.listOfData.observe(
            this,
            Observer(function = fun(datalist: List<DataListModel>) {
                datalist?.let {
                    mRecyclerView.adapter = DataListAdapter(this, datalist)
                }
            })
        )
    }
}