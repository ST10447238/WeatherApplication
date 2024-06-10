package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

data class WeatherData(
    val day: String,
    val mimTemp: Int,
    val maxTemp: Int,
    val condition:String,
)
class MainActivity4 : AppCompatActivity() {
    private lateinit var btnCompute: Button   // (IIE,2024)
    private lateinit var btnClear: Button
    private lateinit var btnExit: Button
    private lateinit var btnAverage: Button
    private lateinit var textView:TextView
    private lateinit var userInput:EditText

    // initialize the array
    private val weeklyWeatherArray = arrayOf(       //(IIE,2024)
        WeatherData("Monday",20,30,"Sunny"),
        WeatherData("Tuesday",25,37,"Rainy"),
        WeatherData("Wednesday",21,31,"Cloudy"),
        WeatherData("Thursday",27,35,"Sunny"),
        WeatherData("Friday",31,41,"Cloudy"),
        WeatherData("Saturday",35,42,"Rainy"),
        WeatherData("Sunday",34,41,"Sunny"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        textView = findViewById<TextView>(R.id.userInput)
        btnCompute = findViewById<Button>(R.id.btnCompute)
        btnClear = findViewById<Button>(R.id.btnClear)
        btnExit = findViewById<Button>(R.id.btnExit)
        userInput = findViewById<EditText>(R.id.userInput)


        // Button click listener to Clear the array
        btnClear.setOnClickListener {
            // clear the data
            userInput.setText("")
            textView.text = ""

        }
        // Button Click listener to exit the Main page
        btnExit.setOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
        }
        btnCompute.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            intent2.putExtra("WeatherData", weeklyWeatherArray)
            startActivity(intent2)
            // (see Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm,2021)
            //            startActivity(intent0) // this is  used to go to another activity or new activity
        }
        btnAverage.setOnClickListener{
            var sum = 0
            for (WeatherData in weeklyWeatherArray){
                sum += WeatherData.mimTemp+WeatherData.maxTemp
            }
            val averageTemperature = sum /(weeklyWeatherArray.size*2)
            textView.text = "Average Temperature:$ average"
        }
    }
}

/* Reference List
        IIE,2024.Introduction to mobile application development.IMAD5112
        Five Minute How to move  from one activity to another activity-Brijesh Kumar Sharm.2021.YouTube Video,added by Tech Projects.[Online].Available at:https://youtu.be/JOdWT50bWw4?si=pKORlQFAtf3J7EXS[Accessed 25 April 20240
*/