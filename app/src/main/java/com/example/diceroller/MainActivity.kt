package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var diceImage_new: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        diceImage_new = findViewById(R.id.dice_image2)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        diceImage.setImageResource(randomPhoto())
        dice_image2.setImageResource(randomPhoto())
    }


    private fun randomPhoto(): Int {
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}