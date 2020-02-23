package com.example.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random


class SecondActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()

    }


    @SuppressLint("StringFormatMatches")
    fun showRandomNumber () {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random
        var  randomInt = 0

        if(count > 0 ){
            randomInt = random.nextInt(count + 1)
            textViewRandom.text = Integer.toString(randomInt)

        } else if (count < 0 ){
            textViewRandom.text = "Нужно положительное число!"
        }


        textViewLabel.text = getString(R.string.random_heading, count)


    }

    fun again (view: View){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val  random = Random
        var randomInt = 0

        randomInt = random.nextInt(count +1)
        textViewRandom.text = Integer.toString(randomInt)
        showToast(this, "Новое число")
    }





}
