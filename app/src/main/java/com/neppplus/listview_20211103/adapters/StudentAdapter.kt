package com.neppplus.listview_20211103.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listview_20211103.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData> ) : ArrayAdapter<StudentData>( mContext, resId, mList ) {
}