package com.example.mypractice

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class My_adapter(val context :Activity,val arrayList: ArrayList<info>) : ArrayAdapter<info>(context,R.layout.each_row,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater  = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_row,null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.textView2)
        val lstmsg = view.findViewById<TextView>(R.id.textView3)
        val time = view.findViewById<TextView>(R.id.last)

        name.text = arrayList[position].name
        lstmsg.text = arrayList[position].last_msg
        time.text = arrayList[position].time
        image.setImageResource(arrayList[position].imageId)
        return view
    }
}