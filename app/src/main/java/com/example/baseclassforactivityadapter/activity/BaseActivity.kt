package com.example.baseclassforactivityadapter.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.baseclassforactivityadapter.modul.Member
import com.example.baseclassforactivityadapter.network.BaseServer

open class BaseActivity:AppCompatActivity() {


fun prepareMemberList():List<Member>{
    val member = ArrayList<Member>()
    for (i in 0..9) {
        member.add(Member("Taep" + i, "Wona" + i))
    }
    return member
  }

    fun isEmpty(s:String?):Boolean{
        return s == null || s.trim {it <= ' '}.isEmpty()
    }

    fun getServer():String{
        return if (BaseServer.IS_TESTER) BaseServer.SERVER_DEVELOPMENT else BaseServer.SERVER_DEPLOYMENT
    }
}