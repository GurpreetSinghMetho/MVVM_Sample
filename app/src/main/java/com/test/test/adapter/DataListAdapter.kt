package com.test.test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.test.dataModel.DataListModel
import com.test.test.databinding.DataRowBinding
import com.test.test.ui.MainActivity

class DataListAdapter(val mainActivity: MainActivity, val datalist: List<DataListModel>) :
    RecyclerView.Adapter<DataListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(DataRowBinding.inflate(LayoutInflater.from(mainActivity), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = datalist[position]
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    class ViewHolder(view: DataRowBinding) : RecyclerView.ViewHolder(view.root) {
        var binding: DataRowBinding = view
    }
}