package com.example.baseclassforactivityadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.baseclassforactivityadapter.R
import com.example.baseclassforactivityadapter.activity.MainActivity
import com.example.baseclassforactivityadapter.modul.Member

class MainAdapter(val action:MainActivity,val member: List<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout,parent,false)
       return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

         val member = member[position]
        if (holder is CustomViewHolder){
            holder.name.text = member.name
            holder.lastname.text = member.lastName
            holder.layClick.setOnClickListener(){
                action.openDetailsPage(member)
            }
        }

       }

    override fun getItemCount(): Int {
        return member.size
    }
    class CustomViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.tv_name)
        val lastname = view.findViewById<TextView>(R.id.tv_lastname)
        val layClick = view.findViewById<LinearLayout>(R.id.lay_clickable)
    }
}