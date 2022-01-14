package com.example.baseclassforactivityadapter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baseclassforactivityadapter.network.BaseServer

class BaseAdapter():RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    fun isEmpty(s:String?):Boolean{
        return s == null || s.trim {it <= ' '}.isEmpty()
    }

    fun getServer():String{
        return if (BaseServer.IS_TESTER) BaseServer.SERVER_DEVELOPMENT else BaseServer.SERVER_DEPLOYMENT
    }
}