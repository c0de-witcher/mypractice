package com.example.mypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val name = intent.getStringExtra("name")
        val phonenu = intent.getStringExtra("phone")
        val image = intent.getIntExtra("image", R.drawable.shivam)//r.drawable for the default pic
        val namei = findViewById<TextView>(R.id.name)
        val phonenui = findViewById<TextView>(R.id.phone)
        val imagei = findViewById<CircleImageView>(R.id.profile_image)
        namei.text = name.toString()
        phonenui.text = phonenu.toString()
        imagei.setImageResource(image)
    }
}