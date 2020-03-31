package com.bigbang.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the Button view and assign a click listener to it
        val rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener {
            rollDice();
        }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener {
            countUp()
        }
    }

    //Click listener for the roll button
    private fun rollDice() {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!";
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        //if text is "Hello World!" set text to 1
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            //convert TextView to 
            var resultInt = resultText.text.toString().toInt()
            //increment number to 6
            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }

    }
}
