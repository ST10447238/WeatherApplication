package com.example.weatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textView = findViewById<TextView>(R.id.userInput)

        val weatherWeeklyArray = intent.getSerializableExtra("WeatherData")as Array<WeatherData>

        textView.text = buildString {

             var output = ""
            for(WeatherData in weatherWeeklyArray){
                output+="Day:${WeatherData.day}\n"
                output +="minTemp:${WeatherData.mimTemp}\n"
                output += "maxTemp:${WeatherData.maxTemp}\n"
                output +="condition:${WeatherData.condition}\n\n"
            }
            textView.text = output
        }
    }
}
/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/