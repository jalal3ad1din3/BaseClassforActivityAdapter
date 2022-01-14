package com.example.baseclassforactivityadapter.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baseclassforactivityadapter.R
import com.example.baseclassforactivityadapter.adapter.MainAdapter
import com.example.baseclassforactivityadapter.modul.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        val member = prepareMemberList()
        refreshAdapter(member)

    }

    fun initView(){
        recyclerView.layoutManager = GridLayoutManager(this,1)

    }

    fun refreshAdapter(member: List<Member>){
        val adapter = MainAdapter(this,member)
        recyclerView.adapter =  adapter
    }


   fun openDetailsPage(member:Member){
       val intent = Intent(this,DetailActivity::class.java)
       startActivity(intent)
   }
}