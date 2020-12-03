package com.example.codingchallenges


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var diceImage2:ImageView
    lateinit var diceImage1:ImageView
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




          button=findViewById(R.id.roll_button)

        button.setOnClickListener { diceRolls() }
        diceImage1=findViewById(R.id.dice_image)
        diceImage2=findViewById(R.id.dice_image)


    }

    private fun diceRolls() {
        dice_image.setImageResource(getRandomDiceImage())
        dice_image2.setImageResource(getRandomDiceImage())

    }


    private fun getRandomDiceImage():Int{

        var randomInt:Int=(1..6).random()

      return when( randomInt){

            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5

            else -> R.drawable.dice_6
        }
    }



}
