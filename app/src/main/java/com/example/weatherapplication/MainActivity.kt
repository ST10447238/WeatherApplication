package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainPage = findViewById<Button>(R.id.btnMainPage)
        btnMainPage.setOnClickListener{
            val intent0 =Intent(this,MainActivity4::class.java)
            startActivity(intent0)
            //(see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            startActivity(intent0) // this is  used to go to another activity or new activity
        }
    }
}
/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/