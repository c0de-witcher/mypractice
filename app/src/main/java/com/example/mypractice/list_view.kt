package com.example.mypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class list_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listview = findViewById<ListView>(R.id.list_View)
        val taskList = ArrayList<String>()
        taskList.add("attend the lecture ")
        taskList.add("complete the notes ")
        taskList.add("read the books and make shorts notes")

        val adapterforlistView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listview.adapter = adapterforlistView
       listview.setOnItemClickListener { parent, view, position, id ->
           val text = "clicked on item : "+ (view as TextView).text.toString()
           Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
       }
    }
}