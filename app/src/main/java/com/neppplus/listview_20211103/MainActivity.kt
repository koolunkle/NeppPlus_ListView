package com.neppplus.listview_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20211103.adapters.StudentAdapter
import com.neppplus.listview_20211103.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData( "조경진", 1988, "서울시 동대문구" )  )
        mStudentList.add( StudentData("김민성", 1998, "서울시 도봉구") )
        mStudentList.add( StudentData("김준기", 1996, "경기도 남양주시") )
        mStudentList.add( StudentData("방우진", 1983, "경기도 고양시") )
        mStudentList.add( StudentData("이아현", 1996, "서울시 동대문구") )
        mStudentList.add( StudentData("이지원", 1993, "서울시 관악구") )
        mStudentList.add( StudentData("차수나", 1977, "서울시 성북구") )
        mStudentList.add( StudentData("김경식", 1992, "서울시 중랑구") )

        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mStudentAdapter

    }
}