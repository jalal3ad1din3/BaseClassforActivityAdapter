package com.example.baseclassforactivityadapter.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baseclassforactivityadapter.R
import com.example.baseclassforactivityadapter.adapter.DeatailAdapter
import com.example.baseclassforactivityadapter.modul.Member
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*


class DetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initView()

        val member = prepareMemberList()
           refreshAdapter(member)

    }
    fun initView(){
        detailActivity.layoutManager = GridLayoutManager(this,1)
    }

    fun refreshAdapter(member: List<Member>){
        val adapter = DeatailAdapter(this,member)
        detailActivity.adapter = adapter
    }

    fun Texter(){
        Toast.makeText(this,"Pressed",Toast.LENGTH_SHORT).show()
    }
}