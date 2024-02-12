package com.example.mypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class custom_listview : AppCompatActivity() {
    lateinit var userarraylist : ArrayList<info>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_listview)

        val name = arrayOf("shivam ","somaya","goli","adityam")
        val lastmsg = arrayOf("hey there","hello ","how are you ","what are you doing")
        val lstmsgTime = arrayOf("09:27","23:20","01:33","02:45")
        val phonenu = arrayOf("9625609545","8750921978","973821007","3804839280")
        val imageid = intArrayOf(R.drawable.briefcase,R.drawable.diamond,R.drawable.document,R.drawable.download)
         userarraylist = ArrayList()

        for (i in name.indices){
            val user = info(name[i],lastmsg[i],lstmsgTime[i],phonenu[i],imageid[i])
            userarraylist.add(user)
        }
        val listview = findViewById<ListView>(R.id.shi)
        listview.isClickable = true
        listview.adapter = My_adapter(this,userarraylist)

        listview.setOnItemClickListener { parent, view, position, id ->
            val username = name[position]
            val userphone = phonenu[position]
            val imgId = imageid[position]

            val intent = Intent(this,User::class.java)
            intent.putExtra("name",username)
            intent.putExtra("phone",userphone)
            intent.putExtra("image",imgId)
            startActivity(intent)
        }


    }
}